SUMMARY = "LDAP client"
DESCRIPTION = "Packages required to enable LDAP client support via sssd on openSUSE MicroOS."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-sssd_ldap-5.0-69.1.aarch64.rpm"
RPM_HASH = "382b3fbb75437a6c59bcad38298d213fae9f1af538abdbef8e1fe5a6041e605b651fee244fdd039882bd04b4c1169ee9f4e83b5d79ec482352c0d1d58474cbaf"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-microos-sssd_ldap patterns-microos-sssd_ldap(aarch-64)"
RDEPENDS:${PN} += "sssd sssd-ldap"

inherit rpm
