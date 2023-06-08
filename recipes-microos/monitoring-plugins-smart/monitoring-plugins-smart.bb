SUMMARY = "Check SMART status of a given disk"
DESCRIPTION = "This plugin does SMART monitoring both ATA and SCSI disks, has an easy usage \
syntax, and automatically produces perfdata for all applicable metrics. \
 \
Note: \
On older distributions you need a line like \
 nagios        ALL=(root) NOPASSWD: /usr/lib/nagios/plugins/check_smart \
in /etc/sudoers to run this script as non privileged user. \
 \
Since SLES 12/openSUSE 12.1, there is a file \
  /etc/sysconfig/sudoers.d/monitoring-plugins-smart \
which holds the same content and should be used automatically."
LICENSE = "SUSE-Public-Domain"

PV = "6.13.0"

RPM_NAME = "monitoring-plugins-smart-6.13.0-1.4.noarch.rpm"
RPM_HASH = "5eef5f550359a7dbd86748f352acd94d0b08b9a1ab2ef75b2e59447358a5a1e4c2b5dd352fa85fdbe0a919aaf95c0b64f049fb01a3749a18801f06932d872252"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(monitoring-plugins-smart) monitoring-plugins-smart nagios-plugins-smart"
RDEPENDS:${PN} += "/usr/bin/perl monitoring-plugins-common perl(File::Basename) perl(FindBin) perl(Getopt::Long) smartmontools sudo"

inherit rpm
