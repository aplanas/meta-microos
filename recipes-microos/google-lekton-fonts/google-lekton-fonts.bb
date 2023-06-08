SUMMARY = "Monospaced Typewriter Font"
DESCRIPTION = "Lekton has been designed at ISIA Urbino, Italy, and is inspired by some of the typefaces used on the Olivetti typewriters. \
 \
It was designed by: Paolo Mazzetti, Luciano Perondi, Raffaele Flaùto, Elena Papassissa, Emilio Macchia, Michela Povoleri, Tobias Seemiller, Riccardo Lorusso, Sabrina Campagna, Elisa Ansuini, Mariangela Di Pinto, Antonio Cavedoni, Marco Comastri, Luna Castroni, Stefano Faoro, Daniele Capo, and Jan Henrik Arnold."
LICENSE = "OFL-1.1"

PV = "22"

RPM_NAME = "google-lekton-fonts-22-11.17.noarch.rpm"
RPM_HASH = "820d0e652964e1afb863b135ae36113d7df329e44cd2624a28c00e85658fc85ff95fd229ac17fe484bcd08db4386877f0ec6d723deb447a2895960242e5a73f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-lekton-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
