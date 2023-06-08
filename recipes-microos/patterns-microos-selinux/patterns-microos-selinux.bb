SUMMARY = "SELinux Support"
DESCRIPTION = "This are packages which are required to enable SELinux on openSUSE MicroOS"
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-selinux-5.0-69.1.aarch64.rpm"
RPM_HASH = "800b2b503e5b134b0ce273e04db2f1b66819759eb89ab3ff735e625d891e1bf1c08b921a16b42d2a572e46ce7356318a0ffbcd1ecdc220a9dfd04d796e0e5cd2"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-microos-selinux patterns-microos-selinux(aarch-64)"
RDEPENDS:${PN} += "container-selinux policycoreutils selinux-policy-targeted selinux-tools"

inherit rpm
