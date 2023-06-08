SUMMARY = "LaTeX macros and fonts for typesetting Amharic"
DESCRIPTION = "Ethiopian language support for the babel package, including a \
collection of fonts and TeX macros for typesetting the \
characters of the languages of Ethiopia, with Metafont fonts \
based on EthTeX's. The macros use the Babel framework."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.7svn15878"

RPM_NAME = "texlive-ethiop-2023.201.0.0.7svn15878-52.1.noarch.rpm"
RPM_HASH = "cc915cfcbf77a1aeca79235e9810467f0ee4100bf886e8cb1c22ac68ef605e77b1303f2d75929fb272a23e9d8d34796c54033f9a7f956f8e152593ee47a780a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(etha10.tfm) tex(etha6.tfm) tex(etha7.tfm) tex(etha8.tfm) tex(ethab10.tfm) tex(ethab11.tfm) tex(ethab12.tfm) tex(ethab14.tfm) tex(ethab18.tfm) tex(ethab24.tfm) tex(ethab36.tfm) tex(ethab9.tfm) tex(etharab.sty) tex(ethas10.tfm) tex(ethasb10.tfm) tex(ethasb11.tfm) tex(ethasb12.tfm) tex(ethasb14.tfm) tex(ethasb18.tfm) tex(ethasb24.tfm) tex(ethasb36.tfm) tex(ethasb9.tfm) tex(ethatt10.tfm) tex(ethb10.tfm) tex(ethb6.tfm) tex(ethb7.tfm) tex(ethb8.tfm) tex(ethbb10.tfm) tex(ethbb11.tfm) tex(ethbb12.tfm) tex(ethbb14.tfm) tex(ethbb18.tfm) tex(ethbb24.tfm) tex(ethbb36.tfm) tex(ethbb9.tfm) tex(ethbs10.tfm) tex(ethbsb10.tfm) tex(ethbsb11.tfm) tex(ethbsb12.tfm) tex(ethbsb14.tfm) tex(ethbsb18.tfm) tex(ethbsb24.tfm) tex(ethbsb36.tfm) tex(ethbsb9.tfm) tex(ethbtt10.tfm) tex(ethiop.ldf) tex(ethiop.sty) tex(uetha.fd) tex(uethb.fd) tex(uetho.fd) texlive-ethiop"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
