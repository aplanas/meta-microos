SUMMARY = "openSUSE MicroOS using Micro DNF"
DESCRIPTION = "This is the openSUSE MicroOS runtime system using the Micro DNF package manager. \
It contains only a minimal multiuser booting system."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-base-microdnf-5.0-70.1.aarch64.rpm"
RPM_HASH = "16c1371b5acc88051d10705e96b88be9c7f5f7170c54d751362e91cb8d5fb868f9452a388f064d587399030ecf2d4ce7cc19723603758cceac78c42f35835477"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-microos-base-microdnf patterns-microos-base-microdnf(aarch-64)"
RDEPENDS:${PN} += "(libdnf-repo-config-zypp or rpm-repos-openSUSE) libdnf-plugin-txnupd microdnf pattern()"

inherit rpm
