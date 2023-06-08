SUMMARY = "Maven plugin for running integration tests"
DESCRIPTION = "The Failsafe Plugin is designed to run integration tests while the \
Surefire Plugins is designed to run unit. The name (failsafe) was \
chosen both because it is a synonym of surefire and because it implies \
that when it fails, it does so in a safe way. \
 \
If you use the Surefire Plugin for running tests, then when you have a \
test failure, the build will stop at the integration-test phase and \
your integration test environment will not have been torn down \
correctly. \
 \
The Failsafe Plugin is used during the integration-test and verify \
phases of the build lifecycle to execute the integration tests of an \
application. The Failsafe Plugin will not fail the build during the \
integration-test phase thus enabling the post-integration-test phase \
to execute."
LICENSE = "Apache-2.0 & CPL-1.0"

PV = "2.22.0"

RPM_NAME = "maven-failsafe-plugin-2.22.0-8.1.noarch.rpm"
RPM_HASH = "d845baa218507ae27c8bf162bc789f8de29e65c4f4ca78448947b744f637df535d743f1ac094e2b7958d77b31bf1a01bb04f82526b6def1725426698994c671c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-failsafe-plugin mvn(org.apache.maven.plugins:maven-failsafe-plugin) mvn(org.apache.maven.plugins:maven-failsafe-plugin:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(commons-io:commons-io) mvn(org.apache.commons:commons-lang3) mvn(org.apache.maven.shared:maven-shared-utils) mvn(org.apache.maven.surefire:maven-surefire-common)"

inherit rpm
