SUMMARY = "Pulls files out of InstallJammer generated executable installers"
DESCRIPTION = "It will search through your binary install blob, identify and extract the files \
buried within and drop them in a local directory. No higher permissions required, \
the only thing that is executed is the Perl script which lives up to Perl's \
reputation of easy inspection."
LICENSE = "GPL-3.0"

PV = "0.2.0"

RPM_NAME = "unpack-install-jammer-0.2.0-1.8.noarch.rpm"
RPM_HASH = "3490cb8d513f01fb6bfeda26461ea1517212b44f889ace56f5dca033bd178d1e9fe066e8a03658149c1c6fc43b54aa5b6369f8f5ee0a8471347664866e0c98b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "unpack-install-jammer"
RDEPENDS:${PN} += "/usr/bin/perl perl(:MODULE_COMPAT_5.36.0) perl-Compress-Raw-Lzma perl-Data-Dump perl-File-HomeDir perl-Modern-Perl perl-Term-ProgressBar"

inherit rpm
