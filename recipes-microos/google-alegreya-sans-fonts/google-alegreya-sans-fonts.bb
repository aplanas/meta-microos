SUMMARY = "Humanist sans serif family, part of Alegreya “super family”"
DESCRIPTION = "Alegreya Sans is a humanist sans serif family with a calligraphic feeling that \
conveys a dynamic and varied rhythm. This gives a pleasant feeling to readers \
of long texts. \
 \
The family follows humanist proportions and principles, just like the serif \
version of the family, Alegreya. It achieves a ludic and harmonious paragraph \
through elements carefully designed in an atmosphere of diversity. The italics \
bring a strong emphasis to the roman styles, and each have seven weights to \
bring you a wide typographic palette. \
 \
Alegreya Sans supports expert latin, greek and cyrillic character sets and \
provides advanced typography OpenType features such as small caps, dynamic \
ligatures and fractions, four set of figures, super and subscript characters, \
ordinals, localized accent forms for spanish, catalan, guaraní, dutch, turkish, \
romanian, serbian among others. \
 \
The Alegreya type system is a “super family”, originally intended for \
literature, and includes sans and serif sister families."
LICENSE = "OFL-1.1"

PV = "2.008"

RPM_NAME = "google-alegreya-sans-fonts-2.008-1.6.noarch.rpm"
RPM_HASH = "5be485959ce789dac4370e09a356d7e27cb0e3c8068a28863f23acb8cbf3907f865cce00d6d24b2ee4e2c0c05cae26aefcec59853267911da79d6c8ba894ac86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-alegreya-sans-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
