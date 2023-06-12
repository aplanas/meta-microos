SUMMARY = "SELinux Support"
DESCRIPTION = "This are packages which are required to enable SELinux on openSUSE MicroOS"
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-selinux-5.0-70.1.aarch64.rpm"
RPM_HASH = "31b95bcb3fcc845d97a2a405443fa5d25c0dce95e3a6d12cd7ebbb0a1a3e9b1030a3fd4cd1e77be9379032ceb2ee3288388b4d03837060dd26e2a585522e4e73"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-microos-selinux patterns-microos-selinux(aarch-64)"
RDEPENDS:${PN} += "container-selinux policycoreutils selinux-policy-targeted selinux-tools"

inherit rpm
