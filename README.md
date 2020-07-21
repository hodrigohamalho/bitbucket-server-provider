# Bitbucket Server Social Identity Provider

This [Keycloak](https://www.keycloak.org) plugin adds an identity provider allowing to use [Bitbucket Server].

## Installation

The plugin installation is simple and can be done without a Keycloak server restart.

* Download the latest release from the [releases page](https://github.com/hodrigohamalho/bitbucket-server)
* Copy the JAR file into the `standalone/deployments` directory in your Keycloak server's root
* Restart Keycloak (optional, hot deployment should work)

You can also clone the Github Repository and install the plugin locally with the following command:

```
$ mvn clean install wildfly:deploy
```

## How to use it

### Configuration

Once the installation is complete, the `Bitbucket Server` identity provider appears. Once selected, you can see the following configuration page:

![bitbucket-server-conf-provider](/assets/bitbucket-server-conf-provider.png)
