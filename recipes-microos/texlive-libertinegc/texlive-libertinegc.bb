SUMMARY = "Libertine add-on to support Greek and Cyrillic"
DESCRIPTION = "The package provides LaTeX support files to access the Greek \
and Cyrillic glyphs in LinuxLibertine. It functions as an \
add-on to the libertine package, using filenames and macro \
names that are compatible with that package. Supported \
encodings: LGR, T2A, T2B, T2C, OT2."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn44616"

RPM_NAME = "texlive-libertinegc-2023.201.1.01svn44616-54.1.noarch.rpm"
RPM_HASH = "7196409b03186c58c2a0bf0ed0a5c3bc3a67dc91fa1f0617ddb9f9b6184cbc44313fd675e2b588ec1db4dd293b752a1294ff32567206f3d4c176439cf0b9591a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(LGRLinuxLibertineT-LF.fd) \
tex(LGRLinuxLibertineT-OsF.fd) \
tex(LGRLinuxLibertineT-TLF.fd) \
tex(LGRLinuxLibertineT-TOsF.fd) \
tex(LinLIbertineT-ot2.tfm) \
tex(LinLibertineT-osf-lgr.tfm) \
tex(LinLibertineT-t2a.tfm) \
tex(LinLibertineT-t2b.tfm) \
tex(LinLibertineT-t2c.tfm) \
tex(LinLibertineT-tlf-lgr.tfm) \
tex(LinLibertineTB-osf-lgr.tfm) \
tex(LinLibertineTB-ot2.tfm) \
tex(LinLibertineTB-t2a.tfm) \
tex(LinLibertineTB-t2b.tfm) \
tex(LinLibertineTB-t2c.tfm) \
tex(LinLibertineTB-tlf-lgr.tfm) \
tex(LinLibertineTBI-osf-lgr.tfm) \
tex(LinLibertineTBI-ot2.tfm) \
tex(LinLibertineTBI-t2a.tfm) \
tex(LinLibertineTBI-t2b.tfm) \
tex(LinLibertineTBI-t2c.tfm) \
tex(LinLibertineTBI-tlf-lgr.tfm) \
tex(LinLibertineTBO-osf-lgr.tfm) \
tex(LinLibertineTBO-ot2.tfm) \
tex(LinLibertineTBO-t2a.tfm) \
tex(LinLibertineTBO-t2b.tfm) \
tex(LinLibertineTBO-t2c.tfm) \
tex(LinLibertineTBO-tlf-lgr.tfm) \
tex(LinLibertineTI-osf-lgr.tfm) \
tex(LinLibertineTI-ot2.tfm) \
tex(LinLibertineTI-t2a.tfm) \
tex(LinLibertineTI-t2b.tfm) \
tex(LinLibertineTI-t2c.tfm) \
tex(LinLibertineTI-tlf-lgr.tfm) \
tex(LinLibertineTO-osf-lgr.tfm) \
tex(LinLibertineTO-ot2.tfm) \
tex(LinLibertineTO-t2a.tfm) \
tex(LinLibertineTO-t2b.tfm) \
tex(LinLibertineTO-t2c.tfm) \
tex(LinLibertineTO-tlf-lgr.tfm) \
tex(LinLibertineTZ-osf-lgr.tfm) \
tex(LinLibertineTZ-ot2.tfm) \
tex(LinLibertineTZ-t2a.tfm) \
tex(LinLibertineTZ-t2b.tfm) \
tex(LinLibertineTZ-t2c.tfm) \
tex(LinLibertineTZ-tlf-lgr.tfm) \
tex(LinLibertineTZI-osf-lgr.tfm) \
tex(LinLibertineTZI-ot2.tfm) \
tex(LinLibertineTZI-t2a.tfm) \
tex(LinLibertineTZI-t2b.tfm) \
tex(LinLibertineTZI-t2c.tfm) \
tex(LinLibertineTZI-tlf-lgr.tfm) \
tex(LinLibertineTZO-osf-lgr.tfm) \
tex(LinLibertineTZO-ot2.tfm) \
tex(LinLibertineTZO-t2a.tfm) \
tex(LinLibertineTZO-t2b.tfm) \
tex(LinLibertineTZO-t2c.tfm) \
tex(LinLibertineTZO-tlf-lgr.tfm) \
tex(OT2LinuxLibertineT-LF.fd) \
tex(OT2LinuxLibertineT-OsF.fd) \
tex(OT2LinuxLibertineT-TLF.fd) \
tex(OT2LinuxLibertineT-TOsF.fd) \
tex(T2ALinuxLibertineT-LF.fd) \
tex(T2ALinuxLibertineT-OsF.fd) \
tex(T2ALinuxLibertineT-TLF.fd) \
tex(T2ALinuxLibertineT-TOsF.fd) \
tex(T2BLinuxLibertineT-LF.fd) \
tex(T2BLinuxLibertineT-OsF.fd) \
tex(T2BLinuxLibertineT-TLF.fd) \
tex(T2BLinuxLibertineT-TOsF.fd) \
tex(T2CLinuxLibertineT-LF.fd) \
tex(T2CLinuxLibertineT-OsF.fd) \
tex(T2CLinuxLibertineT-TLF.fd) \
tex(T2CLinuxLibertineT-TOsF.fd) \
tex(lib-ot2.enc) \
tex(lib-t2a.enc) \
tex(lib-t2a1.enc) \
tex(lib-t2a2.enc) \
tex(lib-t2b.enc) \
tex(lib-t2b1.enc) \
tex(lib-t2b2.enc) \
tex(lib-t2c.enc) \
tex(lib-t2c1.enc) \
tex(lib-t2c2.enc) \
tex(lib1-ot2.enc) \
tex(libertinegc.map) \
tex(libertinegc.sty) \
tex(libosf-lgr.enc) \
tex(libtlf-lgr.enc) \
texlive-libertinegc"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fontenc.sty) \
tex(libertine.sty) \
tex(updmap.cfg) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
