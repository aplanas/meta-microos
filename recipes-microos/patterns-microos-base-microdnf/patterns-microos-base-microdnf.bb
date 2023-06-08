SUMMARY = "openSUSE MicroOS using Micro DNF"
DESCRIPTION = "This is the openSUSE MicroOS runtime system using the Micro DNF package manager. \
It contains only a minimal multiuser booting system."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-base-microdnf-5.0-69.1.aarch64.rpm"
RPM_HASH = "08e161fa29d12802aebba6e0d036f22dfb7656fd50dd59bdfb87499fe358d3112e0115691ffd35567db2bdd3b0c5cab96506a0a022e3afe2218bcce3a96bc19d"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-microos-base-microdnf patterns-microos-base-microdnf(aarch-64)"
RDEPENDS:${PN} += "(libdnf-repo-config-zypp or rpm-repos-openSUSE) libdnf-plugin-txnupd microdnf pattern()"

inherit rpm
