SUMMARY = "Plugin to check HAProxy (csv) stats url"
DESCRIPTION = "The plugin checks HAProxy statistic url (csv) and gets UP and DOWN services."
LICENSE = "GPL-2.0-or-later"

PV = "1.1g6790d7f"

RPM_NAME = "monitoring-plugins-haproxy-1.1g6790d7f-1.6.noarch.rpm"
RPM_HASH = "532b16c207444c1d3f2d1c3cbefb44f78f800035e069995003c1f5c77ff5ea9a56cb0e60886dd4a0eef49e594485c5eb9abc9f348a1a0c7d476ae138651b63be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(monitoring-plugins-haproxy) monitoring-plugins-haproxy nagios-plugins-haproxy"
RDEPENDS:${PN} += "/usr/bin/perl perl(Data::Dumper) perl(File::Basename) perl(HTTP::Request) perl(HTTP::Status) perl(LWP::UserAgent) perl(Locale::gettext) perl(Nagios::Plugin) perl(Time::HiRes)"

inherit rpm
