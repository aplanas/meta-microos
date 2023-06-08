SUMMARY = "Guess file type"
DESCRIPTION = "checktype_filename(), checktype_filehandle() and checktype_contents returns \
string contains file type with MIME mediatype format."
LICENSE = "Apache-1.0"

PV = "1.30"

RPM_NAME = "perl-File-MMagic-1.30-5.26.noarch.rpm"
RPM_HASH = "5944bb049ff0d74bf7c68ea91621a2866eb14c7e4473c2d38b03405785f2770ebc1f4bfa8eee065f850d614972138cea24314af995979b81c6de1024b02e9e17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(File::MMagic) perl-File-MMagic"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
