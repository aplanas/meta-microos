SUMMARY = "Javadoc for native-platform"
DESCRIPTION = "This package contains javadoc for native-platform."
LICENSE = "Apache-2.0"

PV = "0.14"

RPM_NAME = "native-platform-javadoc-0.14-2.9.noarch.rpm"
RPM_HASH = "f49842c0f6b4b2975584825ef9bc671a7cbdc25a95795451c05b5f47b73aeffec9b647d232878bbaeff672962e7716e968bdb869c56336a7a2ff733c34dda464"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "native-platform-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
