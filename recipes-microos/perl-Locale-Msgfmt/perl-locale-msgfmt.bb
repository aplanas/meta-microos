SUMMARY = "Compile .po files to .mo files"
DESCRIPTION = "Compile .po files to .mo files"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.15"

RPM_NAME = "perl-Locale-Msgfmt-0.15-8.21.noarch.rpm"
RPM_HASH = "2679c24498f804a07f8225981c154c951b649788f903ffd52c0fb0183fe9b974b3b3312728303cbb705f0f940c2b85afd6c1b37eb8e21ad335024197c0fd19d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Locale::Msgfmt) \
perl(Locale::Msgfmt::Utils) \
perl(Locale::Msgfmt::mo) \
perl(Locale::Msgfmt::po) \
perl(Module::Install::Msgfmt) \
perl-Locale-Msgfmt"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
