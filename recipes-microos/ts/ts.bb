SUMMARY = "Timestamp standard input"
DESCRIPTION = "ts adds a timestamp to the beginning of each line of input. \
 \
It supports custom time formats as in the strftime function. It also supports converting existing timestamps in input to relative ones."
LICENSE = "GPL-2.0-or-later"

PV = "0.67"

RPM_NAME = "ts-0.67-2.2.noarch.rpm"
RPM_HASH = "a7da17109baf75a556c9cfe7999951b9e64b57bf936e1ff37e69adf03b67eb80ee0b4b9d873e8315833656f817bbddc696baa3d518cf0bda6f23d145c663091a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "moreutils:/usr/bin/ts ts"
RDEPENDS:${PN} += "/usr/bin/perl perl(Date::Parse) perl(Getopt::Long) perl(POSIX) perl(Time::Duration) perl(Time::HiRes) perl(strict) perl(warnings)"

inherit rpm
