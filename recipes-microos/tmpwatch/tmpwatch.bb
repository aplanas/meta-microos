SUMMARY = "Watches file system activity, such as /tmp files"
DESCRIPTION = "The tmpwatch utility recursively searches through specified directories \
and removes files which have not been accessed in a specified period of \
time. tmpwatch is normally used to clean up directories which are used \
for temporarily holding files (for example, /tmp). \
 \
There are multiple tools called 'tmpwatch', this package contains the \
Fedora/Red Hat version previously available at \
https://fedorahosted.org/tmpwatch and now hosted at \
https://pagure.io/tmpwatch"
LICENSE = "GPL-2.0-only"

PV = "2.11"

RPM_NAME = "tmpwatch-2.11-6.12.aarch64.rpm"
RPM_HASH = "6d09c8a1ef3c54ccf9942ee575c3b31c1cdfed791ccc0f217c724f6970615b46fb83adf97193f3d6e05ea1e7f8089e60dd0e2446e632d5d0ef8e5a6e3f1570bd"

RPROVIDES:${PN} += "config(tmpwatch) tmpwatch tmpwatch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cron ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) psmisc"

inherit rpm
