SUMMARY = "A letter class option file for the automatic creation of copies"
DESCRIPTION = "The file copy.lco provides the new class option 'copy' for the \
KOMA-Script letter class scrlttr2. If the option 'copy' is \
given, all pages of a specific letter are duplicated with \
background text marking as copies."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3asvn56733"

RPM_NAME = "texlive-scrlttr2copy-2023.201.0.0.3asvn56733-53.1.noarch.rpm"
RPM_HASH = "899f532302cd02cca672ca183be1659dabfb6a5ac8a9967abee91e38a9f4c25780b79a2b37f02e7ef8bef55a50e11885cf5ffa492dad509bd465ab6fbce9b718"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scrlttr2copy"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
