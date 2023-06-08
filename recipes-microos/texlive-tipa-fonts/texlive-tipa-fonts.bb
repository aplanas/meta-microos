SUMMARY = "Severed fonts for texlive-tipa"
DESCRIPTION = "The  separated fonts package for texlive-tipa"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn29349"

RPM_NAME = "texlive-tipa-fonts-2023.201.1.3svn29349-52.1.noarch.rpm"
RPM_HASH = "73cf0894579471b75c62e4755feb6db3d6cf7c8a1d72b4a0f7ba01b1d92ae36531328e9d82f6c6d8987c83e52e20d1bd11828e85841d475fe2d79c0703efbba0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(:lang=aa) font(:lang=an) font(:lang=ay) font(:lang=bi) font(:lang=br) font(:lang=ch) font(:lang=co) font(:lang=crh) font(:lang=cs) font(:lang=csb) font(:lang=da) font(:lang=de) font(:lang=en) font(:lang=es) font(:lang=et) font(:lang=eu) font(:lang=fi) font(:lang=fil) font(:lang=fj) font(:lang=fo) font(:lang=fr) font(:lang=fur) font(:lang=fy) font(:lang=gd) font(:lang=gl) font(:lang=gv) font(:lang=ho) font(:lang=hsb) font(:lang=ht) font(:lang=hu) font(:lang=ia) font(:lang=id) font(:lang=ie) font(:lang=io) font(:lang=is) font(:lang=it) font(:lang=jv) font(:lang=kj) font(:lang=ku-tr) font(:lang=kwm) font(:lang=lb) font(:lang=lg) font(:lang=li) font(:lang=mg) font(:lang=ms) font(:lang=nb) font(:lang=nds) font(:lang=ng) font(:lang=nl) font(:lang=nn) font(:lang=no) font(:lang=nr) font(:lang=nso) font(:lang=oc) font(:lang=om) font(:lang=pap-an) font(:lang=pap-aw) font(:lang=pl) font(:lang=pt) font(:lang=rm) font(:lang=rn) font(:lang=rw) font(:lang=sc) font(:lang=sg) font(:lang=sk) font(:lang=sma) font(:lang=smj) font(:lang=sn) font(:lang=so) font(:lang=sq) font(:lang=ss) font(:lang=st) font(:lang=su) font(:lang=sv) font(:lang=sw) font(:lang=tk) font(:lang=tl) font(:lang=tn) font(:lang=tr) font(:lang=ts) font(:lang=uz) font(:lang=vo) font(:lang=vot) font(:lang=wa) font(:lang=wen) font(:lang=wo) font(:lang=xh) font(:lang=yap) font(:lang=za) font(:lang=zu) font(tex\040tipa10) font(tex\040tipa12) font(tex\040tipa17) font(tex\040tipa8) font(tex\040tipa9) font(tex\040tipab10) font(tex\040tipabs10) font(tex\040tipabx10) font(tex\040tipabx12) font(tex\040tipabx8) font(tex\040tipabx9) font(tex\040tipasb10) font(tex\040tipasi10) font(tex\040tipasl10) font(tex\040tipasl12) font(tex\040tipasl8) font(tex\040tipasl9) font(tex\040tipass10) font(tex\040tipass12) font(tex\040tipass17) font(tex\040tipass8) font(tex\040tipass9) font(tex\040tipats10) font(tex\040tipatt10) font(tex\040tipatt12) font(tex\040tipatt8) font(tex\040tipatt9) font(tex\040tipx10) font(tex\040tipx12) font(tex\040tipx17) font(tex\040tipx8) font(tex\040tipx9) font(tex\040tipxb10) font(tex\040tipxbs10) font(tex\040tipxbx10) font(tex\040tipxbx12) font(tex\040tipxbx8) font(tex\040tipxbx9) font(tex\040tipxsb10) font(tex\040tipxsi10) font(tex\040tipxsl10) font(tex\040tipxsl12) font(tex\040tipxsl8) font(tex\040tipxsl9) font(tex\040tipxss10) font(tex\040tipxss12) font(tex\040tipxss17) font(tex\040tipxss8) font(tex\040tipxss9) font(tex\040tipxts10) font(tex\040tipxtt10) font(tex\040tipxtt12) font(tex\040tipxtt8) font(tex\040tipxtt9) font(tex\040xipa10) font(tex\040xipab10) font(tex\040xipabs10) font(tex\040xipasb10) font(tex\040xipasi10) font(tex\040xipasl10) font(tex\040xipass10) font(tex\040xipx10) font(tex\040xipxb10) font(tex\040xipxbs10) font(tex\040xipxsb10) font(tex\040xipxsi10) font(tex\040xipxsl10) font(tex\040xipxss10) texlive-tipa-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
