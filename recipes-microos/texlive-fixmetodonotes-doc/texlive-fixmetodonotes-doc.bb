SUMMARY = "Documentation for texlive-fixmetodonotes"
DESCRIPTION = "This package includes the documentation for texlive-fixmetodonotes"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.2.2svn30168"

RPM_NAME = "texlive-fixmetodonotes-doc-2023.201.0.0.2.2svn30168-52.1.noarch.rpm"
RPM_HASH = "b8ee312d932d41d26b01939b889bc21966f32ab292ce2db84c12e70edd088e31cdef110775a53cbcc640a223668305be7c0b7d90a408a28a3d4e7ef8d2fef6c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fixmetodonotes-doc"
RDEPENDS:${PN} += ""

inherit rpm
