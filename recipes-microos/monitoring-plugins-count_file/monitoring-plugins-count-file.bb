SUMMARY = "Counts the number of files in a directory"
DESCRIPTION = "Use this plugin to count the number of files in a directory and \
issue a warning or critical state if the number exceeds a limit. \
 \
Useful if you want to monitor for example: \
* a directory which contains error files and must stay empty \
* a tmp dir which have to stay under a practical limit"
LICENSE = "BSD-4-Clause"

PV = "232"

RPM_NAME = "monitoring-plugins-count_file-232-1.15.noarch.rpm"
RPM_HASH = "d094c00d959d58ec964592e45e748d145ee1944329db251b54169b8e843b5700519e6cd7520e4716c21306a01f257fdf42e7c684a7741b7fec72ac6f1f888c3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-count_file nagios-plugins-count_file"
RDEPENDS:${PN} += "/usr/bin/perl perl"

inherit rpm
