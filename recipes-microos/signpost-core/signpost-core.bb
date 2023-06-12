SUMMARY = "A simple, light-weight, and modular OAuth client library for the Java platform"
DESCRIPTION = "Signpost is the easy and intuitive solution for signing HTTP messages on the \
Java platform in conformance with the OAuth Core 1.0a standard. \
Signpost follows a modular and flexible design, allowing you to combine it with \
different HTTP messaging layers"
LICENSE = "Apache-2.0"

PV = "1.2.1.2"

RPM_NAME = "signpost-core-1.2.1.2-3.10.noarch.rpm"
RPM_HASH = "d5b681159339c430016b01f5f9c71d5a132803ceb4e149baa9062e2dc71686e7cb808859822b84920d950a3bdd15e929e8d952d9e235a24df2b3544de1c4fc4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(oauth.signpost:signpost-core) \
mvn(oauth.signpost:signpost-core:pom:) \
signpost-core"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(commons-codec:commons-codec)"

inherit rpm
