SUMMARY = "Generic archive extracting mechanism"
DESCRIPTION = "Archive::Extract is a generic archive extraction mechanism. \
 \
It allows you to extract any archive file of the type .tar, .tar.gz, .gz, \
.Z, tar.bz2, .tbz, .bz2, .zip, .xz,, .txz, .tar.xz or .lzma without having \
to worry how it does so, or use different interfaces for each type by using \
either perl modules, or commandline tools on your system. \
 \
See the 'HOW IT WORKS' section further down for details."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.88"

RPM_NAME = "perl-Archive-Extract-0.88-1.9.noarch.rpm"
RPM_HASH = "3be0160f396b4b759e3a0773a1007154aaec94fc24dcbd5067bd0aa6c765db135f0244712afbe593c2ddf8ab98b7810dc121aed701c24797adb129ed8132ecdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Archive::Extract) perl-Archive-Extract"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(IPC::Cmd) perl(Locale::Maketext::Simple) perl(Module::Load::Conditional) perl(Params::Check)"

inherit rpm
