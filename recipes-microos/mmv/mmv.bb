SUMMARY = "Move/Copy/Append/Link Multiple Files by Wildcard Patterns"
DESCRIPTION = "Mmv moves (or copies, appends, or links, as specified) each source file matching \
a from pattern to the target name specified by the to pattern.  This multiple \
action is performed safely, i.e. without any unexpected deletion of files due to \
collisions of target names with existing filenames or with other target names. \
Furthermore, before doing anything, mmv attempts to detect any errors that would \
result from the entire set of actions specified and gives the user the choice of \
either proceeding by avoiding the offending parts or aborting."
LICENSE = "GPL-1.0-or-later"

PV = "2.3"

RPM_NAME = "mmv-2.3-1.3.aarch64.rpm"
RPM_HASH = "1e02fed856c8a3a55827b516e77133f48374a6297611d7558b7c645b62608cdebf5c41d95da1bd92bf7c4642f48dcc340830bcac1f1c46fb2c0cb8e9854a04a4"

RPROVIDES:${PN} += "mmv \
mmv(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgc.so.1()(64bit)"

inherit rpm
