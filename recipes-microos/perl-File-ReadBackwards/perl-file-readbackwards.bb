SUMMARY = "Read a file backwards by lines"
DESCRIPTION = "This module reads a file backwards line by line. It is simple to use, \
memory efficient and fast. It supports both an object and a tied handle \
interface. \
 \
It is intended for processing log and other similar text files which \
typically have their newest entries appended to them. By default files are \
assumed to be plain text and have a line ending appropriate to the OS. But \
you can set the input record separator string on a per file basis."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.06"

RPM_NAME = "perl-File-ReadBackwards-1.06-1.9.noarch.rpm"
RPM_HASH = "0ef2c6a8f77ae904aafadb071529148edb7cd865cf874c193390830da629f5d961c5c014de61fe5a41a36481204e15faeefa757aad41fbb8a739978281e1a0d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(File::ReadBackwards) perl-File-ReadBackwards"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
