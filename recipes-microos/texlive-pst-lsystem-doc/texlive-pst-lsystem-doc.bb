SUMMARY = "Documentation for texlive-pst-lsystem"
DESCRIPTION = "This package includes the documentation for texlive-pst-lsystem"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02svn49556"

RPM_NAME = "texlive-pst-lsystem-doc-2023.201.0.0.02svn49556-52.1.noarch.rpm"
RPM_HASH = "c47ed8ea92fc8ff1a0b640c461ba5fac4c5ef0a8628be68d427f26e60ba07feb687353ba98cc6ee9e0c5339122ce80c377032910d055edc811930ffe8d760938"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-lsystem-doc"
RDEPENDS:${PN} += ""

inherit rpm
