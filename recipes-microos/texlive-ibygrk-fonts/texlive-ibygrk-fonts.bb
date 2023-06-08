SUMMARY = "Severed fonts for texlive-ibygrk"
DESCRIPTION = "The  separated fonts package for texlive-ibygrk"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.4.5svn15878"

RPM_NAME = "texlive-ibygrk-fonts-2023.201.4.5svn15878-52.1.noarch.rpm"
RPM_HASH = "64158a97fb529d92e37dd75416bc494d689234348cd07bb606918ef6a867a77401a4f684cef6a8fe7af469a09ef0eecea19cdd22a406cdc783aa2709f2886ad5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(ibycushtgpolytonicgreek) texlive-ibygrk-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
