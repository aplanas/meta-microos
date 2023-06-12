SUMMARY = "Font maps and configuration tools for Japanese/Chinese/Korean fonts with (u)ptex"
DESCRIPTION = "This package provides font maps and setup tools for Japanese, \
Korean, Traditional Chinese, and Simplified Chinese. It is the \
successor of the jfontmaps package. The files in this package \
contain font maps for dvipdfmx to make various \
Japanese/Chinese/Korean fonts available for (u)ptex and related \
programs and formats."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.20210625.0svn65953"

RPM_NAME = "texlive-ptex-fontmaps-2023.201.20210625.0svn65953-53.1.noarch.rpm"
RPM_HASH = "0e88cdca4a7c89661714c33335831fddb1697192b95779b0d4df408b305387ce43d221041256b6c1673dd0f5b9a9202559b45658cca105bd0e4d3ef175948ad8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(otf-bizud.map) \
tex(otf-canon.map) \
tex(otf-haranoaji.map) \
tex(otf-hiragino-pron.map) \
tex(otf-hiragino.map) \
tex(otf-ipa.map) \
tex(otf-ipaex.map) \
tex(otf-ko-adobe.map) \
tex(otf-ko-apple.map) \
tex(otf-ko-baekmuk.map) \
tex(otf-ko-haranoaji.map) \
tex(otf-ko-ms.map) \
tex(otf-ko-noEmbed.map) \
tex(otf-ko-noto-otc.map) \
tex(otf-ko-noto.map) \
tex(otf-ko-solaris.map) \
tex(otf-ko-sourcehan-otc.map) \
tex(otf-ko-sourcehan.map) \
tex(otf-ko-unfonts.map) \
tex(otf-kozuka-pr6.map) \
tex(otf-kozuka-pr6n.map) \
tex(otf-kozuka.map) \
tex(otf-moga-mobo-ex.map) \
tex(otf-moga-mobo.map) \
tex(otf-morisawa-pr6n.map) \
tex(otf-morisawa.map) \
tex(otf-ms-osx.map) \
tex(otf-ms.map) \
tex(otf-noEmbed.map) \
tex(otf-noto-otc.map) \
tex(otf-noto.map) \
tex(otf-sc-adobe.map) \
tex(otf-sc-arphic.map) \
tex(otf-sc-cjkunifonts-ttf.map) \
tex(otf-sc-cjkunifonts.map) \
tex(otf-sc-fandol.map) \
tex(otf-sc-founder.map) \
tex(otf-sc-haranoaji.map) \
tex(otf-sc-ms-osx.map) \
tex(otf-sc-ms.map) \
tex(otf-sc-noEmbed.map) \
tex(otf-sc-noto-otc.map) \
tex(otf-sc-noto.map) \
tex(otf-sc-sourcehan-otc.map) \
tex(otf-sc-sourcehan.map) \
tex(otf-sourcehan-otc.map) \
tex(otf-sourcehan.map) \
tex(otf-tc-adobe.map) \
tex(otf-tc-arphic.map) \
tex(otf-tc-cjkunifonts-ttf.map) \
tex(otf-tc-cjkunifonts.map) \
tex(otf-tc-dynacomware.map) \
tex(otf-tc-haranoaji.map) \
tex(otf-tc-ms-win10.map) \
tex(otf-tc-ms.map) \
tex(otf-tc-noEmbed.map) \
tex(otf-tc-noto-otc.map) \
tex(otf-tc-noto.map) \
tex(otf-tc-sourcehan-otc.map) \
tex(otf-tc-sourcehan.map) \
tex(otf-ume.map) \
tex(otf-up-bizud.map) \
tex(otf-up-canon.map) \
tex(otf-up-haranoaji.map) \
tex(otf-up-hiragino-pron.map) \
tex(otf-up-hiragino.map) \
tex(otf-up-ipa.map) \
tex(otf-up-ipaex.map) \
tex(otf-up-kozuka-pr6.map) \
tex(otf-up-kozuka-pr6n.map) \
tex(otf-up-kozuka.map) \
tex(otf-up-moga-mobo-ex.map) \
tex(otf-up-moga-mobo.map) \
tex(otf-up-morisawa-pr6n.map) \
tex(otf-up-morisawa.map) \
tex(otf-up-ms-osx.map) \
tex(otf-up-ms.map) \
tex(otf-up-noEmbed.map) \
tex(otf-up-noto-otc.map) \
tex(otf-up-noto.map) \
tex(otf-up-sourcehan-otc.map) \
tex(otf-up-sourcehan.map) \
tex(otf-up-ume.map) \
tex(otf-up-yu-osx.map) \
tex(otf-up-yu-win.map) \
tex(otf-up-yu-win10.map) \
tex(otf-yu-osx.map) \
tex(otf-yu-win.map) \
tex(otf-yu-win10.map) \
tex(ptex-bizud.map) \
tex(ptex-canon.map) \
tex(ptex-fontmaps-data.dat) \
tex(ptex-haranoaji-04.map) \
tex(ptex-haranoaji.map) \
tex(ptex-hiragino-04.map) \
tex(ptex-hiragino-pron-04.map) \
tex(ptex-hiragino-pron.map) \
tex(ptex-hiragino.map) \
tex(ptex-ipa.map) \
tex(ptex-ipaex.map) \
tex(ptex-kozuka-04.map) \
tex(ptex-kozuka-pr6-04.map) \
tex(ptex-kozuka-pr6.map) \
tex(ptex-kozuka-pr6n-04.map) \
tex(ptex-kozuka-pr6n.map) \
tex(ptex-kozuka.map) \
tex(ptex-moga-mobo-04.map) \
tex(ptex-moga-mobo-ex-04.map) \
tex(ptex-moga-mobo-ex.map) \
tex(ptex-moga-mobo.map) \
tex(ptex-morisawa-04.map) \
tex(ptex-morisawa-pr6n-04.map) \
tex(ptex-morisawa-pr6n.map) \
tex(ptex-morisawa.map) \
tex(ptex-ms-osx.map) \
tex(ptex-ms.map) \
tex(ptex-noEmbed-04.map) \
tex(ptex-noEmbed.map) \
tex(ptex-noto-04.map) \
tex(ptex-noto-otc-04.map) \
tex(ptex-noto-otc.map) \
tex(ptex-noto.map) \
tex(ptex-sourcehan-04.map) \
tex(ptex-sourcehan-otc-04.map) \
tex(ptex-sourcehan-otc.map) \
tex(ptex-sourcehan.map) \
tex(ptex-ume.map) \
tex(ptex-yu-osx-04.map) \
tex(ptex-yu-osx.map) \
tex(ptex-yu-win.map) \
tex(ptex-yu-win10.map) \
tex(uptex-bizud.map) \
tex(uptex-canon.map) \
tex(uptex-haranoaji-04.map) \
tex(uptex-haranoaji.map) \
tex(uptex-hiragino-04.map) \
tex(uptex-hiragino-pron-04.map) \
tex(uptex-hiragino-pron.map) \
tex(uptex-hiragino.map) \
tex(uptex-ipa.map) \
tex(uptex-ipaex.map) \
tex(uptex-ko-adobe.map) \
tex(uptex-ko-apple.map) \
tex(uptex-ko-baekmuk.map) \
tex(uptex-ko-haranoaji.map) \
tex(uptex-ko-ms.map) \
tex(uptex-ko-noEmbed.map) \
tex(uptex-ko-noto-otc.map) \
tex(uptex-ko-noto.map) \
tex(uptex-ko-solaris.map) \
tex(uptex-ko-sourcehan-otc.map) \
tex(uptex-ko-sourcehan.map) \
tex(uptex-ko-unfonts.map) \
tex(uptex-kozuka-04.map) \
tex(uptex-kozuka-pr6-04.map) \
tex(uptex-kozuka-pr6.map) \
tex(uptex-kozuka-pr6n-04.map) \
tex(uptex-kozuka-pr6n.map) \
tex(uptex-kozuka.map) \
tex(uptex-moga-mobo-04.map) \
tex(uptex-moga-mobo-ex-04.map) \
tex(uptex-moga-mobo-ex.map) \
tex(uptex-moga-mobo.map) \
tex(uptex-morisawa-04.map) \
tex(uptex-morisawa-pr6n-04.map) \
tex(uptex-morisawa-pr6n.map) \
tex(uptex-morisawa.map) \
tex(uptex-ms-osx.map) \
tex(uptex-ms.map) \
tex(uptex-noEmbed-04.map) \
tex(uptex-noEmbed.map) \
tex(uptex-noto-04.map) \
tex(uptex-noto-otc-04.map) \
tex(uptex-noto-otc.map) \
tex(uptex-noto.map) \
tex(uptex-sc-adobe.map) \
tex(uptex-sc-arphic.map) \
tex(uptex-sc-cjkunifonts-ttf.map) \
tex(uptex-sc-cjkunifonts.map) \
tex(uptex-sc-fandol.map) \
tex(uptex-sc-founder.map) \
tex(uptex-sc-haranoaji.map) \
tex(uptex-sc-ms-osx.map) \
tex(uptex-sc-ms.map) \
tex(uptex-sc-noEmbed.map) \
tex(uptex-sc-noto-otc.map) \
tex(uptex-sc-noto.map) \
tex(uptex-sc-sourcehan-otc.map) \
tex(uptex-sc-sourcehan.map) \
tex(uptex-sourcehan-04.map) \
tex(uptex-sourcehan-otc-04.map) \
tex(uptex-sourcehan-otc.map) \
tex(uptex-sourcehan.map) \
tex(uptex-tc-adobe.map) \
tex(uptex-tc-arphic.map) \
tex(uptex-tc-cjkunifonts-ttf.map) \
tex(uptex-tc-cjkunifonts.map) \
tex(uptex-tc-dynacomware.map) \
tex(uptex-tc-haranoaji.map) \
tex(uptex-tc-ms-win10.map) \
tex(uptex-tc-ms.map) \
tex(uptex-tc-noEmbed.map) \
tex(uptex-tc-noto-otc.map) \
tex(uptex-tc-noto.map) \
tex(uptex-tc-sourcehan-otc.map) \
tex(uptex-tc-sourcehan.map) \
tex(uptex-ume.map) \
tex(uptex-yu-osx-04.map) \
tex(uptex-yu-osx.map) \
tex(uptex-yu-win.map) \
tex(uptex-yu-win10.map) \
texlive-ptex-fontmaps"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
ed \
findutils \
grep \
perl \
perl(Cwd) \
perl(Getopt::Long) \
perl(Pod::Usage) \
perl(TeXLive::TLUtils) \
perl(Tk) \
perl(Tk::Dialog) \
perl(Tk::NoteBook) \
perl(strict) \
sed \
tex(texmf.cnf) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-ptex-fontmaps-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-texlive.infra"

inherit rpm
