SUMMARY = "Check age of files in a directory"
DESCRIPTION = "This plugin checks one or more directory for files older than a specified age. \
You can define the age of files for warning and critical states. \
 \
Note: the plugin checks the mtime of files, not the ctime. \
 \
Usage: check_dircontent.pl -w 24 -c 48 -p /tmp,/var/tmp -i foo,bar \
Options: \
       -w|--warning   : time for warnings (minutes) \
       -c|--critical  : time for critical warnings (minutes) \
       -p|--pathnames : absolute path to the folders, split mutliple pathnames with commata \
       -t|--timeout   : timeout (default: 15) \
	   -i|--ignore    : ignore filenames (comma separated) \
	   -d|--debug     : print debug output"
LICENSE = "BSD-3-Clause"

PV = "0.7"

RPM_NAME = "monitoring-plugins-contentage-0.7-1.9.noarch.rpm"
RPM_HASH = "ed61c6044b1840e0e35901fb84e4a553c33a0c95480165c9c93458ec5700a968cefa224d27245ff8a21125c55e019404f038e6983fe1d7ecad62955d3edf07b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-contentage nagios-plugins-contentage"
RDEPENDS:${PN} += "/usr/bin/perl perl(File::Basename) perl(File::stat) perl(Getopt::Long) perl(POSIX) perl(Time::HiRes)"

inherit rpm
