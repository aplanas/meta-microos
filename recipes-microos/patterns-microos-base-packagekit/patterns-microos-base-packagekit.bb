SUMMARY = "openSUSE MicroOS using PackageKit"
DESCRIPTION = "This is the openSUSE MicroOS runtime system using the PackageKit service. \
It contains only a minimal multiuser booting system."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-base-packagekit-5.0-69.1.aarch64.rpm"
RPM_HASH = "fa90348c5f06e5ed97fe1089271fe5c2e20e62a8637d8e114f65b5485cc711a3fa60e6e56395c16df4c9898b07c304101d1bcbcdc031a7cf3659192e64d6eb41"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-microos-base-packagekit patterns-microos-base-packagekit(aarch-64)"
RDEPENDS:${PN} += "(libdnf-repo-config-zypp or rpm-repos-openSUSE) PackageKit PackageKit-branding-openSUSE libdnf-plugin-txnupd pattern()"

inherit rpm
