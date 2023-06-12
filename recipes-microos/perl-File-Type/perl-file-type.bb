SUMMARY = "determine file type using magic"
DESCRIPTION = "File::Type uses magic numbers (typically at the start of a file) to \
determine the MIME type of that file. \
 \
 \
 \
Authors: \
-------- \
    Paul Mison <pmison at fotango dot com>"
LICENSE = "Artistic-1.0"

PV = "0.22"

RPM_NAME = "perl-File-Type-0.22-163.29.aarch64.rpm"
RPM_HASH = "590e9cc15f9fdc571833ad4546445e51518bd2924f0a44e1a373bd20802e41d45af4d73b91b9fed62ce525fad97fe59dd1d91aea1643fed8e29d7ec1bed784a3"

RPROVIDES:${PN} += "perl(File::Type) \
perl(File::Type::Builder) \
perl-File-Type \
perl-File-Type(aarch-64)"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
