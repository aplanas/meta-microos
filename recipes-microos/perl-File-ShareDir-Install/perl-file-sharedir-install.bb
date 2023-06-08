SUMMARY = "Install shared files"
DESCRIPTION = "File::ShareDir::Install allows you to install read-only data files from a \
distribution. It is a companion module to File::ShareDir, which allows you \
to locate these files after installation. \
 \
It is a port of Module::Install::Share to ExtUtils::MakeMaker with the \
improvement of only installing the files you want; '.svn', '.git' and other \
source-control junk will be ignored. \
 \
Please note that this module installs read-only data files; empty \
directories will be ignored."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.14"

RPM_NAME = "perl-File-ShareDir-Install-0.14-1.4.noarch.rpm"
RPM_HASH = "ebc74e0a51db85af7905ae41f18cdeede0d0c80a28bb1010b228f5f85c68424ce85db2225b975be4661cc4bef99ff29df43c386c1a0e3ef6e00a521837ba9d20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(File::ShareDir::Install) perl-File-ShareDir-Install"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
