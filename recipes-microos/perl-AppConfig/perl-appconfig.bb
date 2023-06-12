SUMMARY = "Perl5 module for reading configuration files and parsing command line ar[cut]"
DESCRIPTION = "Perl5 module for reading configuration files and parsing command line arguments."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.71"

RPM_NAME = "perl-AppConfig-1.71-1.27.noarch.rpm"
RPM_HASH = "c3d4ad01548685a56e0c41bdcb97dd17fe384f728593922d382fa050a6348773bec596e7f45978170cd7c978c593f3eb5ff23fe96f6f0122808a2ecb5ee1fb3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(AppConfig) \
perl(AppConfig::Args) \
perl(AppConfig::CGI) \
perl(AppConfig::File) \
perl(AppConfig::Getopt) \
perl(AppConfig::State) \
perl(AppConfig::Sys) \
perl-AppConfig"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
