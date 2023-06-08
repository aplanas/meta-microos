SUMMARY = "The ConTeXt macro package"
DESCRIPTION = "A full featured, parameter driven macro package, which fully \
supports advanced interactive documents. See the ConTeXt garden \
for a wealth of support information."
LICENSE = "LPPL-1.0"

PV = "2023.204.svn66546"

RPM_NAME = "texlive-context-2023.204.svn66546-54.1.noarch.rpm"
RPM_HASH = "b061564b970cf73f8af9a4f3bbd7f702f48aab28fd1c58f951b4ef8189ee0f2c675380686bd29e74771383562263b91e8abc2b17ae9a4d45eb329abfb49de766"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Tk::path_tre) tex(aesop-de.tex) tex(aristotle-grc.tex) tex(bidi-symbols.tex) tex(bryson.tex) tex(capek-cz.tex) tex(capek-vlnka-cz.tex) tex(carey.tex) tex(carrol.tex) tex(cervantes-es.tex) tex(context-lmtx-error.tex) tex(context-performance.tex) tex(context-test.tex) tex(context-todo.tex) tex(contnav.map) tex(contnav.tfm) tex(darwin.tex) tex(davis.tex) tex(dawkins.tex) tex(demo-mps.tex) tex(demo-symbols.tex) tex(demo-tex.tex) tex(demo-xml.tex) tex(dequincey.tex) tex(douglas.tex) tex(dyrynk-cz.tex) tex(dyrynk-vlnka-cz.tex) tex(export-example.tex) tex(filenames.tex) tex(gray.tex) tex(greenfield.tex) tex(hawking.tex) tex(herbert-en.tex) tex(herbert-es.tex) tex(hviezdoslav-sk.tex) tex(hviezdoslav-vlnka-sk.tex) tex(i-readme.tex) tex(jaros-sk.tex) tex(jaros-vlnka-sk.tex) tex(jojomayer.tex) tex(khatt-ar.tex) tex(khatt-en.tex) tex(klein.tex) tex(knuth.tex) tex(kollar-cz.tex) tex(kollar-vlnka-cz.tex) tex(komensky-cz.tex) tex(komensky-vlnka-cz.tex) tex(krdel-sk.tex) tex(kun-cz.tex) tex(linden.tex) tex(lorem.tex) tex(luatex-basics-prepare.tex) tex(luatex-basics.tex) tex(luatex-core.tex) tex(luatex-fonts.tex) tex(luatex-gadgets.tex) tex(luatex-languages.tex) tex(luatex-math.tex) tex(luatex-mplib.tex) tex(luatex-pdf.tex) tex(luatex-plain.tex) tex(luatex-preprocessor-test.tex) tex(luatex-preprocessor.tex) tex(luatex-swiglib-test.tex) tex(luatex-swiglib.tex) tex(luatex-test.tex) tex(m-ch-de.sty) tex(m-ch-en.sty) tex(m-ch-nl.sty) tex(m-pictex.sty) tex(m-tikz-pgfplots.tex) tex(m-tikz-pgfplotstable.tex) tex(materie.tex) tex(mcnish.tex) tex(montgomery.tex) tex(mtx-context-arrange.tex) tex(mtx-context-combine.tex) tex(mtx-context-common.tex) tex(mtx-context-compare.tex) tex(mtx-context-copy.tex) tex(mtx-context-domotica.tex) tex(mtx-context-fonts.tex) tex(mtx-context-hashed.tex) tex(mtx-context-ideas.tex) tex(mtx-context-listing.tex) tex(mtx-context-meaning.tex) tex(mtx-context-module.tex) tex(mtx-context-precache.tex) tex(mtx-context-select.tex) tex(mtx-context-setters.tex) tex(mtx-context-setups.tex) tex(mtx-context-sql.tex) tex(mtx-context-timing.tex) tex(mtx-context-trim.tex) tex(mtx-context-xml.tex) tex(original-context-symbol.map) tex(poe.tex) tex(pope-en.tex) tex(pope-es.tex) tex(quevedo-es.tex) tex(reich.tex) tex(s-abbreviations-extras.tex) tex(s-abbreviations-logos.tex) tex(s-cdr-01.tex) tex(s-faq-00.tex) tex(s-faq-01.tex) tex(s-faq-02.tex) tex(s-faq-03.tex) tex(s-pre-00.tex) tex(s-pre-06.tex) tex(s-pre-07.tex) tex(s-pre-08.tex) tex(s-pre-12.tex) tex(s-pre-13.tex) tex(s-pre-16.tex) tex(s-pre-18.tex) tex(s-pre-22.tex) tex(s-pre-23.tex) tex(s-pre-26.tex) tex(s-pre-27.tex) tex(s-pre-50.tex) tex(s-pre-66.tex) tex(s-pre-67.tex) tex(s-pre-93.tex) tex(s-pre-96.tex) tex(sample.tex) tex(samples.tex) tex(sapolsky.tex) tex(scite-context-readme.tex) tex(shakespeare-en.tex) tex(shakespeare-es.tex) tex(shelley-en.tex) tex(shelley-es.tex) tex(shelley-fr.tex) tex(slova-sk.tex) tex(smrek-sk.tex) tex(smrek-vlnka-sk.tex) tex(stork.tex) tex(thuan.tex) tex(tlig.map) tex(tufte.tex) tex(vallejo-trilce-es.tex) tex(waltham.tex) tex(ward.tex) tex(weisman.tex) tex(welcome-to-context.tex) tex(zapf.tex) texlive-context"
RDEPENDS:${PN} += "/bin/sh /usr/bin/texlua coreutils ed findutils grep perl(Config) perl(Cwd) perl(Data::Dumper) perl(File::Copy) perl(File::Find) perl(FindBin) perl(Getopt::Long) perl(Tk) perl(Tk::DirTree) perl(Tk::ROText) perl(Tk::widgets) perl(base) perl(lib) perl(strict) sed tex(pst-plot.sty) tex(pstricks.sty) tex(updmap.cfg) texlive texlive-amsfonts texlive-context-bin texlive-context-fonts texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-lm texlive-lm-math texlive-luatex texlive-manfnt-font texlive-mflogo-font texlive-scripts texlive-scripts-bin texlive-stmaryrd"

inherit rpm
