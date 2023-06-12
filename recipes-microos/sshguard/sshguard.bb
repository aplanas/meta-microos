SUMMARY = "SSH brute force attack protector"
DESCRIPTION = "Sshguard protects networked hosts from brute force attacks \
against ssh servers. It detects such attacks and blocks the \
attacker's address with a firewall rule."
LICENSE = "ISC"

PV = "2.4.2"

RPM_NAME = "sshguard-2.4.2-6.3.aarch64.rpm"
RPM_HASH = "822dc3a495a460f59e53fd444632f502502277a9db282ff2ef040bd28f24290484147dbcbe9182642dd129048e2fe1c9613373e64d6bd74617bfe122372a6f3e"

RPROVIDES:${PN} += "config(sshguard) \
sshguard \
sshguard(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
openssh \
systemd"

inherit rpm
