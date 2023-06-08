SUMMARY = "Backup program using hardlinks"
DESCRIPTION = "rsnapshot is a filesystem snapshot utility for making backups of local \
and remote systems. Using rsync and hard links, it is possible to keep \
multiple, full backups instantly available. The disk space required is \
just a little more than the space of one full backup, plus \
incrementals. Depending on your configuration, it is quite possible to \
set up in just a few minutes. Files can be restored by the users who \
own them, without the root user getting involved. There are no tapes to \
change, so once it's set up, you may never need to think about it \
again."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.4"

RPM_NAME = "rsnapshot-1.4.4-2.6.noarch.rpm"
RPM_HASH = "24acf77f6e90d6d13815b4bebc932e0859b9dd1572ad9ba612a8cc80f7cf9a932d3653a6fa93d57da3b2f098d7c1598f0c8f376d1071f3b802ef86fd8c26d0e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(rsnapshot) rsnapshot"
RDEPENDS:${PN} += "/usr/bin/perl logrotate openssh perl rsync util-linux-systemd"

inherit rpm
