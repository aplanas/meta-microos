SUMMARY = "Macros for typesetting high energy physics particle names"
DESCRIPTION = "HEPparticles is a set of macros for typesetting high energy \
particle names, to meet the following criteria: 1. The main \
particle name is a Roman or Greek symbol, to be typeset in \
upright font in normal contexts. 2. Additionally a superscript \
and/or subscript may follow the main symbol. 3. Particle \
resonances may also have a resonance specifier which is typeset \
in parentheses following the main symbol. In general the \
parentheses may also be followed by sub- and superscripts. 4. \
The particle names are expected to be used both in and out of \
mathematical contexts. 5. If the surrounding text is bold or \
italic then the particle name should adapt to that context as \
best as possible (this may not be possible for Greek symbols). \
A consequence of point 5 is that the well-known problems with \
boldness of particle names in section titles, headers and \
tables of contents automatically disappear if these macros are \
used."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn35723"

RPM_NAME = "texlive-hepparticles-2023.201.2.0svn35723-53.1.noarch.rpm"
RPM_HASH = "e5bff0973f6e07cbb5c467e90e85542a1780d1d7a3a38a820fa902193e59a738a5500144cb317ad02497dff6c10b5a40f881fb9815c75b3d819b7edfccd688a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hepparticles.sty) texlive-hepparticles"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsmath.sty) tex(subdepth.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
