SUMMARY = "Utilities to read and manipulate patches and CVS"
DESCRIPTION = "This perl library allows you to manipulate patches programmatically by chaining \
together a variety of objects that read, manipulate, and output patch \
information."
LICENSE = "GPL-2.0+ | Artistic-1.0"

PV = "0.9.6"

RPM_NAME = "perl-PatchReader-0.9.6-1.19.noarch.rpm"
RPM_HASH = "8851e57dcd7a1e0161e7a02438c4218afbc91f268eedfa445047e2c85790afa0a6c68fb34ccb609a323fee7a6cf72e0ce5baa125607fd972662fe06d5a9ab435"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(PatchReader) perl(PatchReader::AddCVSContext) perl(PatchReader::Base) perl(PatchReader::CVSClient) perl(PatchReader::DiffPrinter::raw) perl(PatchReader::DiffPrinter::template) perl(PatchReader::FilterPatch) perl(PatchReader::FixPatchRoot) perl(PatchReader::NarrowPatch) perl(PatchReader::PatchInfoGrabber) perl(PatchReader::Raw) perl-PatchReader"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Cwd) perl(File::Temp)"

inherit rpm
