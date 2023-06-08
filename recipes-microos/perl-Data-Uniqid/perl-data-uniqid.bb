SUMMARY = "Perl extension for simple genrating of unique id's"
DESCRIPTION = "Data::Uniqid provides three simple routines for generating unique ids. \
These ids are coded with a Base62 systen to make them short and handy (e.g. \
to use it as part of a URL). \
 \
  suinqid \
    genrates a very short id valid only for the localhost and with a \
    liftime of 1 day \
 \
  uniqid \
    generates a short id valid on the local host \
 \
  luniqid \
    generates a long id valid everywhere and ever"
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "0.12"

RPM_NAME = "perl-Data-Uniqid-0.12-1.23.noarch.rpm"
RPM_HASH = "8b05836fbcc10cf0ce3ec2fc7d3fbe7e843aa04968daddb0fe316d4726eb4d471fcf237e40dcf41d3ec5e5c57d9c817e9989745c377eaf902331012960730511"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Data::Uniqid) perl-Data-Uniqid"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
