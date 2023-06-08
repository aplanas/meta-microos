SUMMARY = "Javadoc for google-errorprone"
DESCRIPTION = "This package contains the API documentation for google-errorprone."
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "google-errorprone-javadoc-2.11.0-2.1.noarch.rpm"
RPM_HASH = "0d93c390ae305dda9c7b6755d3c7fb6698b31e62463d9e46a56ef3b214dec850e145c05c00a9b30c3e85ce1cb73a0af2de6c4d824c49c3556c6c80ec7f188c15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-errorprone-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
