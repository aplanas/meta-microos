SUMMARY = "Check operability of computer hardware and find drivers"
DESCRIPTION = "A tool to check operability of computer hardware and upload result \
to the Linux hardware database. \
 \
Probe — is a snapshot of your computer hardware state and system \
logs. The tool checks operability of devices by analysis of logs \
and returns a permanent url to view the probe of the computer. \
 \
The tool is intended to simplify collecting of logs necessary for \
investigating hardware related problems. Just run one simple \
command in the console to check your hardware and collect all the \
system logs at once: \
 \
    sudo -E hw-probe -all -upload \
 \
By creating probes you contribute to the HDD/SSD Real-Life \
Reliability Test study: https://github.com/linuxhw/SMART"
LICENSE = "LGPL-2.0+"

PV = "1.5"

RPM_NAME = "hw-probe-1.5-1.7.noarch.rpm"
RPM_HASH = "2f9b5e72070a3219de8fd0291d74d5948a5d769dadf14d5f41a2baced691c492f6b2ab157a860d690a4bb5ca0add36d7e820d08e8c0fb721ecfa495f77cbd7ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hw-probe"
RDEPENDS:${PN} += "/usr/bin/perl acpica curl dmidecode hdparm hwinfo lsb-release pciutils perl-libwww-perl sensors smartmontools sysstat usbutils util-linux"

inherit rpm
