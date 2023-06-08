SUMMARY = "Free Chinese-German Dictionary in EDICT Format"
DESCRIPTION = "This is a free Chinese-German dictionary that can be used, for example, \
with Gjiten. \
 \
Everyone is invited to help develop it together with the authors (see \
URL and e-mail addresses in the author list). It is based in large \
parts on CEDICT which in turn has been modelled on Jim Breen's highly \
successful EDICT (Japanese-English dictionary) project. \
 \
 \
 \
Authors: \
-------- \
    Michael Klaus Engel <redaktion@chdw.de> \
    Jan Hefti <redaktion@chdw.de> \
    Helmut Anker <redaktion@chdw.de> \
    Jennifer Gross <redaktion@chdw.de> \
    Julia Mannigel <redaktion@chdw.de> \
    Tian Xiaoyong <redaktion@chdw.de> \
    Steffen Weidenhaus <redaktion@chdw.de> \
    Zhao Chunhua <redaktion@chdw.de> \
    Zheng Meishi <redaktion@chdw.de>"
LICENSE = "CC-BY-SA-3.0 & GPL-2.0+"

PV = "20090318"

RPM_NAME = "handedict-20090318-20.17.noarch.rpm"
RPM_HASH = "70b8936c0733843b0d9568cf3da2bb882da78a3a29c94335d0d1265319dc7570aee1af850c2ca8debc53bb2bcd940a7c4cf94dff4a6d3e0b90434f0782cd4e63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "handedict locale(gjiten:zh)"
RDEPENDS:${PN} += ""

inherit rpm
