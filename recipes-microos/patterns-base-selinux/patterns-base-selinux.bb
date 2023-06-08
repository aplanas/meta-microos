SUMMARY = "SELinux"
DESCRIPTION = "Security-Enhanced Linux (SELinux) provides a mechanism for supporting access control security policies, including mandatory access controls (MAC). \
Its architecture strives to separate enforcement of security decisions from the security policy, and streamlines the amount of software involved with security policy enforcement."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-selinux-20200505-40.1.aarch64.rpm"
RPM_HASH = "c1fb230dd8e59f39c1386b453ee912abfbf8f2567f3d566284ee312950d32b58b81bb8199a072edcbc8ae5c3c58889286b559ed10e611896a5a99454bb82795a"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-base-selinux patterns-base-selinux(aarch-64)"
RDEPENDS:${PN} += "pattern() policycoreutils selinux-autorelabel selinux-policy selinux-tools"

inherit rpm
