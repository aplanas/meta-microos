SUMMARY = "Import packages into other packages"
DESCRIPTION = "Writing exporters is a pain. Some use the Exporter manpage, some use the \
Sub::Exporter manpage, some use the Moose::Exporter manpage, some use the \
Exporter::Declare manpage ... and some things are pragmas. \
 \
Exporting on someone else's behalf is harder. The exporters don't provide a \
consistent API for this, and pragmas need to have their import method \
called directly, since they effect the current unit of compilation. \
 \
'Import::Into' provides global methods to make this painless."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.002005"

RPM_NAME = "perl-Import-Into-1.002005-1.24.noarch.rpm"
RPM_HASH = "b3b52a745fae456aca78a2507a54a4ae0d838e72153ad0d3759e265fef616a63b0eb0bafee948664a52abad1ffe1f9660e24e67a7616ea6c574f84117bf9b587"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Import::Into) \
perl-Import-Into"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Module::Runtime)"

inherit rpm
