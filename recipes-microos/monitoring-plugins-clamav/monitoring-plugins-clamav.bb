SUMMARY = "Check to see if your ClamAV signatures are current"
DESCRIPTION = "This check plugin is a Perl script which compares your local signature database \
(daily.cvd) version to the version advertised from the ClamAV site. It verifies \
the latest ClamAV revision using a DNS TXT query against \
current.cvd.clamav.net."
LICENSE = "ISC"

PV = "1.2"

RPM_NAME = "monitoring-plugins-clamav-1.2-1.16.noarch.rpm"
RPM_HASH = "74f9e4e15e606ffb41b7ca83d56921a98abbeba915a1d1d14cc1f111948ca1adb3e167ea2fe1a51aa53f862e12a5d744b0db7be77be9a1c6adef6f3fd9ae5c9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-clamav nagios-plugins-clamav"
RDEPENDS:${PN} += "/usr/bin/perl clamav monitoring-plugins-common perl(File::Basename) perl(Net::DNS)"

inherit rpm
