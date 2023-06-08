SUMMARY = "Write roman number with 'bars'"
DESCRIPTION = "'Bars', in the present context, are lines above and below text \
that abut with the text. Barred roman numerals are sometimes \
found in publications. The package provides a function that \
prints barred roman numerals (converting arabic numerals if \
necessary). The package also provides a predicate \\ifnumeric."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0fsvn25005"

RPM_NAME = "texlive-romanbar-2023.201.1.0fsvn25005-53.1.noarch.rpm"
RPM_HASH = "9a4065ee8c5a23dd91f6125363c141b64b053ef02df4bcfa3bb27d293a88437a68026ab435167c463bd0bcb917a57d50c30d0de864a5f962697594196eacf858"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(romanbar.sty) texlive-romanbar"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
