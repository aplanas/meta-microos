SUMMARY = "Perl Scripts for Mirroring FTP Servers"
DESCRIPTION = "Mirror is a package written in Perl that uses the FTP protocol to duplicate \
a directory hierarchy between the machine it is run on and a remote host. It \
avoids copying files unnecessarily by comparing the file time-stamps and \
file sizes before transferring. Amongst other things, it can optionally \
rename, compress, gzip, and split files."
LICENSE = "SUSE-mirror"

PV = "2.9"

RPM_NAME = "mirror-2.9-910.18.noarch.rpm"
RPM_HASH = "0a7f9c0323cb5971fd9dc870c29a2bad35d7f7ae54a03ccba2a3d0db7fbce2d4a201d486642a15d0404c35891c829e21df3b027b59c77c04af724b83668f068c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mirror"
RDEPENDS:${PN} += "/usr/bin/perl \
perl"

inherit rpm
