# google-cloud-java-default-project-bug-repro

On a GCE host in the GCP project `bad-food-17` with credentials for a service account in the project `feisty-beverage-4711`.

`google-cloud-core` `1.3.0` correctly defaults to the SA project:
```
GOOGLE_APPLICATION_CREDENTIALS=sa-key.json mvn -q compile exec:java -Dexec.mainClass=Repro -Dgoogle.cloud.core.version=1.3.0 | grep ServiceOptions.getDefaultProjectId
ServiceOptions.getDefaultProjectId(): feisty-beverage-4711
```

`google-cloud-core` `1.4.0+` incorrectly defaults to the GCE metadata project:
```
GOOGLE_APPLICATION_CREDENTIALS=sa-key.json mvn -q compile exec:java -Dexec.mainClass=Repro -Dgoogle.cloud.core.version=1.4.0 | grep ServiceOptions.getDefaultProjectId
ServiceOptions.getDefaultProjectId(): bad-food-17
```

