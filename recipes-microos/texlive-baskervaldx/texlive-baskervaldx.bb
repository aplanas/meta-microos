SUMMARY = "Extension and modification of BaskervaldADF with LaTeX support"
DESCRIPTION = "Extends and modifies the BaskervaldADF font (a Baskerville \
substitute) with more accented glyphs, with small caps and \
oldstyle figures in all shapes. Includes OpenType and \
PostScript fonts, as well as LaTeX support files."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.076svn57080"

RPM_NAME = "texlive-baskervaldx-2023.201.1.076svn57080-53.1.noarch.rpm"
RPM_HASH = "9232643ef2267fc83684f6eee32ac680e8a4a566a7cd06e0317a57e0397ac7da3fcdd90d9b7313713d1c868f9c31ac6697d13c07c0878acd9cd254e8f2f8f1b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(Baskervaldx-Bol-lf-ly1--base.tfm) \
tex(Baskervaldx-Bol-lf-ly1.tfm) \
tex(Baskervaldx-Bol-lf-ly1.vf) \
tex(Baskervaldx-Bol-lf-ot1.tfm) \
tex(Baskervaldx-Bol-lf-sc-ly1--base.tfm) \
tex(Baskervaldx-Bol-lf-sc-ly1.tfm) \
tex(Baskervaldx-Bol-lf-sc-ly1.vf) \
tex(Baskervaldx-Bol-lf-sc-ot1--base.tfm) \
tex(Baskervaldx-Bol-lf-sc-ot1.tfm) \
tex(Baskervaldx-Bol-lf-sc-ot1.vf) \
tex(Baskervaldx-Bol-lf-sc-t1--base.tfm) \
tex(Baskervaldx-Bol-lf-sc-t1.tfm) \
tex(Baskervaldx-Bol-lf-sc-t1.vf) \
tex(Baskervaldx-Bol-lf-swash-ly1--base.tfm) \
tex(Baskervaldx-Bol-lf-swash-ly1.tfm) \
tex(Baskervaldx-Bol-lf-swash-ly1.vf) \
tex(Baskervaldx-Bol-lf-swash-t1--base.tfm) \
tex(Baskervaldx-Bol-lf-swash-t1.tfm) \
tex(Baskervaldx-Bol-lf-swash-t1.vf) \
tex(Baskervaldx-Bol-lf-t1--base.tfm) \
tex(Baskervaldx-Bol-lf-t1.tfm) \
tex(Baskervaldx-Bol-lf-t1.vf) \
tex(Baskervaldx-Bol-lf-ts1--base.tfm) \
tex(Baskervaldx-Bol-lf-ts1.tfm) \
tex(Baskervaldx-Bol-lf-ts1.vf) \
tex(Baskervaldx-Bol-osf-ly1--base.tfm) \
tex(Baskervaldx-Bol-osf-ly1.tfm) \
tex(Baskervaldx-Bol-osf-ly1.vf) \
tex(Baskervaldx-Bol-osf-ot1.tfm) \
tex(Baskervaldx-Bol-osf-sc-ly1--base.tfm) \
tex(Baskervaldx-Bol-osf-sc-ly1.tfm) \
tex(Baskervaldx-Bol-osf-sc-ly1.vf) \
tex(Baskervaldx-Bol-osf-sc-ot1--base.tfm) \
tex(Baskervaldx-Bol-osf-sc-ot1.tfm) \
tex(Baskervaldx-Bol-osf-sc-ot1.vf) \
tex(Baskervaldx-Bol-osf-sc-t1--base.tfm) \
tex(Baskervaldx-Bol-osf-sc-t1.tfm) \
tex(Baskervaldx-Bol-osf-sc-t1.vf) \
tex(Baskervaldx-Bol-osf-swash-ly1--base.tfm) \
tex(Baskervaldx-Bol-osf-swash-ly1.tfm) \
tex(Baskervaldx-Bol-osf-swash-ly1.vf) \
tex(Baskervaldx-Bol-osf-swash-t1--base.tfm) \
tex(Baskervaldx-Bol-osf-swash-t1.tfm) \
tex(Baskervaldx-Bol-osf-swash-t1.vf) \
tex(Baskervaldx-Bol-osf-t1--base.tfm) \
tex(Baskervaldx-Bol-osf-t1.tfm) \
tex(Baskervaldx-Bol-osf-t1.vf) \
tex(Baskervaldx-Bol-osf-ts1--base.tfm) \
tex(Baskervaldx-Bol-osf-ts1.tfm) \
tex(Baskervaldx-Bol-osf-ts1.vf) \
tex(Baskervaldx-Bol-osf.tfm) \
tex(Baskervaldx-Bol-sup-ly1--base.tfm) \
tex(Baskervaldx-Bol-sup-ly1.tfm) \
tex(Baskervaldx-Bol-sup-ly1.vf) \
tex(Baskervaldx-Bol-sup-ot1.tfm) \
tex(Baskervaldx-Bol-sup-t1--base.tfm) \
tex(Baskervaldx-Bol-sup-t1.tfm) \
tex(Baskervaldx-Bol-sup-t1.vf) \
tex(Baskervaldx-Bol-tlf-ly1--base.tfm) \
tex(Baskervaldx-Bol-tlf-ly1.tfm) \
tex(Baskervaldx-Bol-tlf-ly1.vf) \
tex(Baskervaldx-Bol-tlf-ot1.tfm) \
tex(Baskervaldx-Bol-tlf-sc-ly1--base.tfm) \
tex(Baskervaldx-Bol-tlf-sc-ly1.tfm) \
tex(Baskervaldx-Bol-tlf-sc-ly1.vf) \
tex(Baskervaldx-Bol-tlf-sc-ot1--base.tfm) \
tex(Baskervaldx-Bol-tlf-sc-ot1.tfm) \
tex(Baskervaldx-Bol-tlf-sc-ot1.vf) \
tex(Baskervaldx-Bol-tlf-sc-t1--base.tfm) \
tex(Baskervaldx-Bol-tlf-sc-t1.tfm) \
tex(Baskervaldx-Bol-tlf-sc-t1.vf) \
tex(Baskervaldx-Bol-tlf-swash-ly1--base.tfm) \
tex(Baskervaldx-Bol-tlf-swash-ly1.tfm) \
tex(Baskervaldx-Bol-tlf-swash-ly1.vf) \
tex(Baskervaldx-Bol-tlf-swash-t1--base.tfm) \
tex(Baskervaldx-Bol-tlf-swash-t1.tfm) \
tex(Baskervaldx-Bol-tlf-swash-t1.vf) \
tex(Baskervaldx-Bol-tlf-t1--base.tfm) \
tex(Baskervaldx-Bol-tlf-t1.tfm) \
tex(Baskervaldx-Bol-tlf-t1.vf) \
tex(Baskervaldx-Bol-tlf-ts1--base.tfm) \
tex(Baskervaldx-Bol-tlf-ts1.tfm) \
tex(Baskervaldx-Bol-tlf-ts1.vf) \
tex(Baskervaldx-Bol-tosf-ly1--base.tfm) \
tex(Baskervaldx-Bol-tosf-ly1.tfm) \
tex(Baskervaldx-Bol-tosf-ly1.vf) \
tex(Baskervaldx-Bol-tosf-ot1.tfm) \
tex(Baskervaldx-Bol-tosf-sc-ly1--base.tfm) \
tex(Baskervaldx-Bol-tosf-sc-ly1.tfm) \
tex(Baskervaldx-Bol-tosf-sc-ly1.vf) \
tex(Baskervaldx-Bol-tosf-sc-ot1--base.tfm) \
tex(Baskervaldx-Bol-tosf-sc-ot1.tfm) \
tex(Baskervaldx-Bol-tosf-sc-ot1.vf) \
tex(Baskervaldx-Bol-tosf-sc-t1--base.tfm) \
tex(Baskervaldx-Bol-tosf-sc-t1.tfm) \
tex(Baskervaldx-Bol-tosf-sc-t1.vf) \
tex(Baskervaldx-Bol-tosf-swash-ly1--base.tfm) \
tex(Baskervaldx-Bol-tosf-swash-ly1.tfm) \
tex(Baskervaldx-Bol-tosf-swash-ly1.vf) \
tex(Baskervaldx-Bol-tosf-swash-t1--base.tfm) \
tex(Baskervaldx-Bol-tosf-swash-t1.tfm) \
tex(Baskervaldx-Bol-tosf-swash-t1.vf) \
tex(Baskervaldx-Bol-tosf-t1--base.tfm) \
tex(Baskervaldx-Bol-tosf-t1.tfm) \
tex(Baskervaldx-Bol-tosf-t1.vf) \
tex(Baskervaldx-Bol-tosf-ts1--base.tfm) \
tex(Baskervaldx-Bol-tosf-ts1.tfm) \
tex(Baskervaldx-Bol-tosf-ts1.vf) \
tex(Baskervaldx-BolIta-alph.tfm) \
tex(Baskervaldx-BolIta-lf-ly1--base.tfm) \
tex(Baskervaldx-BolIta-lf-ly1.tfm) \
tex(Baskervaldx-BolIta-lf-ly1.vf) \
tex(Baskervaldx-BolIta-lf-ot1.tfm) \
tex(Baskervaldx-BolIta-lf-sc-ly1--base.tfm) \
tex(Baskervaldx-BolIta-lf-sc-ly1.tfm) \
tex(Baskervaldx-BolIta-lf-sc-ly1.vf) \
tex(Baskervaldx-BolIta-lf-sc-ot1--base.tfm) \
tex(Baskervaldx-BolIta-lf-sc-ot1.tfm) \
tex(Baskervaldx-BolIta-lf-sc-ot1.vf) \
tex(Baskervaldx-BolIta-lf-sc-t1--base.tfm) \
tex(Baskervaldx-BolIta-lf-sc-t1.tfm) \
tex(Baskervaldx-BolIta-lf-sc-t1.vf) \
tex(Baskervaldx-BolIta-lf-swash-ly1--base.tfm) \
tex(Baskervaldx-BolIta-lf-swash-ly1.tfm) \
tex(Baskervaldx-BolIta-lf-swash-ly1.vf) \
tex(Baskervaldx-BolIta-lf-swash-t1--base.tfm) \
tex(Baskervaldx-BolIta-lf-swash-t1.tfm) \
tex(Baskervaldx-BolIta-lf-swash-t1.vf) \
tex(Baskervaldx-BolIta-lf-t1--base.tfm) \
tex(Baskervaldx-BolIta-lf-t1.tfm) \
tex(Baskervaldx-BolIta-lf-t1.vf) \
tex(Baskervaldx-BolIta-lf-ts1--base.tfm) \
tex(Baskervaldx-BolIta-lf-ts1.tfm) \
tex(Baskervaldx-BolIta-lf-ts1.vf) \
tex(Baskervaldx-BolIta-osf-ly1--base.tfm) \
tex(Baskervaldx-BolIta-osf-ly1.tfm) \
tex(Baskervaldx-BolIta-osf-ly1.vf) \
tex(Baskervaldx-BolIta-osf-ot1.tfm) \
tex(Baskervaldx-BolIta-osf-sc-ly1--base.tfm) \
tex(Baskervaldx-BolIta-osf-sc-ly1.tfm) \
tex(Baskervaldx-BolIta-osf-sc-ly1.vf) \
tex(Baskervaldx-BolIta-osf-sc-ot1--base.tfm) \
tex(Baskervaldx-BolIta-osf-sc-ot1.tfm) \
tex(Baskervaldx-BolIta-osf-sc-ot1.vf) \
tex(Baskervaldx-BolIta-osf-sc-t1--base.tfm) \
tex(Baskervaldx-BolIta-osf-sc-t1.tfm) \
tex(Baskervaldx-BolIta-osf-sc-t1.vf) \
tex(Baskervaldx-BolIta-osf-swash-ly1--base.tfm) \
tex(Baskervaldx-BolIta-osf-swash-ly1.tfm) \
tex(Baskervaldx-BolIta-osf-swash-ly1.vf) \
tex(Baskervaldx-BolIta-osf-swash-t1--base.tfm) \
tex(Baskervaldx-BolIta-osf-swash-t1.tfm) \
tex(Baskervaldx-BolIta-osf-swash-t1.vf) \
tex(Baskervaldx-BolIta-osf-t1--base.tfm) \
tex(Baskervaldx-BolIta-osf-t1.tfm) \
tex(Baskervaldx-BolIta-osf-t1.vf) \
tex(Baskervaldx-BolIta-osf-ts1--base.tfm) \
tex(Baskervaldx-BolIta-osf-ts1.tfm) \
tex(Baskervaldx-BolIta-osf-ts1.vf) \
tex(Baskervaldx-BolIta-sup-ly1--base.tfm) \
tex(Baskervaldx-BolIta-sup-ly1.tfm) \
tex(Baskervaldx-BolIta-sup-ly1.vf) \
tex(Baskervaldx-BolIta-sup-ot1.tfm) \
tex(Baskervaldx-BolIta-sup-t1--base.tfm) \
tex(Baskervaldx-BolIta-sup-t1.tfm) \
tex(Baskervaldx-BolIta-sup-t1.vf) \
tex(Baskervaldx-BolIta-tlf-ly1--base.tfm) \
tex(Baskervaldx-BolIta-tlf-ly1.tfm) \
tex(Baskervaldx-BolIta-tlf-ly1.vf) \
tex(Baskervaldx-BolIta-tlf-ot1.tfm) \
tex(Baskervaldx-BolIta-tlf-sc-ly1--base.tfm) \
tex(Baskervaldx-BolIta-tlf-sc-ly1.tfm) \
tex(Baskervaldx-BolIta-tlf-sc-ly1.vf) \
tex(Baskervaldx-BolIta-tlf-sc-ot1--base.tfm) \
tex(Baskervaldx-BolIta-tlf-sc-ot1.tfm) \
tex(Baskervaldx-BolIta-tlf-sc-ot1.vf) \
tex(Baskervaldx-BolIta-tlf-sc-t1--base.tfm) \
tex(Baskervaldx-BolIta-tlf-sc-t1.tfm) \
tex(Baskervaldx-BolIta-tlf-sc-t1.vf) \
tex(Baskervaldx-BolIta-tlf-swash-ly1--base.tfm) \
tex(Baskervaldx-BolIta-tlf-swash-ly1.tfm) \
tex(Baskervaldx-BolIta-tlf-swash-ly1.vf) \
tex(Baskervaldx-BolIta-tlf-swash-t1--base.tfm) \
tex(Baskervaldx-BolIta-tlf-swash-t1.tfm) \
tex(Baskervaldx-BolIta-tlf-swash-t1.vf) \
tex(Baskervaldx-BolIta-tlf-t1--base.tfm) \
tex(Baskervaldx-BolIta-tlf-t1.tfm) \
tex(Baskervaldx-BolIta-tlf-t1.vf) \
tex(Baskervaldx-BolIta-tlf-ts1--base.tfm) \
tex(Baskervaldx-BolIta-tlf-ts1.tfm) \
tex(Baskervaldx-BolIta-tlf-ts1.vf) \
tex(Baskervaldx-BolIta-tosf-ly1--base.tfm) \
tex(Baskervaldx-BolIta-tosf-ly1.tfm) \
tex(Baskervaldx-BolIta-tosf-ly1.vf) \
tex(Baskervaldx-BolIta-tosf-ot1.tfm) \
tex(Baskervaldx-BolIta-tosf-sc-ly1--base.tfm) \
tex(Baskervaldx-BolIta-tosf-sc-ly1.tfm) \
tex(Baskervaldx-BolIta-tosf-sc-ly1.vf) \
tex(Baskervaldx-BolIta-tosf-sc-ot1--base.tfm) \
tex(Baskervaldx-BolIta-tosf-sc-ot1.tfm) \
tex(Baskervaldx-BolIta-tosf-sc-ot1.vf) \
tex(Baskervaldx-BolIta-tosf-sc-t1--base.tfm) \
tex(Baskervaldx-BolIta-tosf-sc-t1.tfm) \
tex(Baskervaldx-BolIta-tosf-sc-t1.vf) \
tex(Baskervaldx-BolIta-tosf-swash-ly1--base.tfm) \
tex(Baskervaldx-BolIta-tosf-swash-ly1.tfm) \
tex(Baskervaldx-BolIta-tosf-swash-ly1.vf) \
tex(Baskervaldx-BolIta-tosf-swash-t1--base.tfm) \
tex(Baskervaldx-BolIta-tosf-swash-t1.tfm) \
tex(Baskervaldx-BolIta-tosf-swash-t1.vf) \
tex(Baskervaldx-BolIta-tosf-t1--base.tfm) \
tex(Baskervaldx-BolIta-tosf-t1.tfm) \
tex(Baskervaldx-BolIta-tosf-t1.vf) \
tex(Baskervaldx-BolIta-tosf-ts1--base.tfm) \
tex(Baskervaldx-BolIta-tosf-ts1.tfm) \
tex(Baskervaldx-BolIta-tosf-ts1.vf) \
tex(Baskervaldx-Ita-alph.tfm) \
tex(Baskervaldx-Ita-lf-ly1--base.tfm) \
tex(Baskervaldx-Ita-lf-ly1.tfm) \
tex(Baskervaldx-Ita-lf-ly1.vf) \
tex(Baskervaldx-Ita-lf-ot1.tfm) \
tex(Baskervaldx-Ita-lf-sc-ly1--base.tfm) \
tex(Baskervaldx-Ita-lf-sc-ly1.tfm) \
tex(Baskervaldx-Ita-lf-sc-ly1.vf) \
tex(Baskervaldx-Ita-lf-sc-ot1--base.tfm) \
tex(Baskervaldx-Ita-lf-sc-ot1.tfm) \
tex(Baskervaldx-Ita-lf-sc-ot1.vf) \
tex(Baskervaldx-Ita-lf-sc-t1--base.tfm) \
tex(Baskervaldx-Ita-lf-sc-t1.tfm) \
tex(Baskervaldx-Ita-lf-sc-t1.vf) \
tex(Baskervaldx-Ita-lf-swash-ly1--base.tfm) \
tex(Baskervaldx-Ita-lf-swash-ly1.tfm) \
tex(Baskervaldx-Ita-lf-swash-ly1.vf) \
tex(Baskervaldx-Ita-lf-swash-t1--base.tfm) \
tex(Baskervaldx-Ita-lf-swash-t1.tfm) \
tex(Baskervaldx-Ita-lf-swash-t1.vf) \
tex(Baskervaldx-Ita-lf-t1--base.tfm) \
tex(Baskervaldx-Ita-lf-t1.tfm) \
tex(Baskervaldx-Ita-lf-t1.vf) \
tex(Baskervaldx-Ita-lf-ts1--base.tfm) \
tex(Baskervaldx-Ita-lf-ts1.tfm) \
tex(Baskervaldx-Ita-lf-ts1.vf) \
tex(Baskervaldx-Ita-osf-ly1--base.tfm) \
tex(Baskervaldx-Ita-osf-ly1.tfm) \
tex(Baskervaldx-Ita-osf-ly1.vf) \
tex(Baskervaldx-Ita-osf-ot1.tfm) \
tex(Baskervaldx-Ita-osf-sc-ly1--base.tfm) \
tex(Baskervaldx-Ita-osf-sc-ly1.tfm) \
tex(Baskervaldx-Ita-osf-sc-ly1.vf) \
tex(Baskervaldx-Ita-osf-sc-ot1--base.tfm) \
tex(Baskervaldx-Ita-osf-sc-ot1.tfm) \
tex(Baskervaldx-Ita-osf-sc-ot1.vf) \
tex(Baskervaldx-Ita-osf-sc-t1--base.tfm) \
tex(Baskervaldx-Ita-osf-sc-t1.tfm) \
tex(Baskervaldx-Ita-osf-sc-t1.vf) \
tex(Baskervaldx-Ita-osf-swash-ly1--base.tfm) \
tex(Baskervaldx-Ita-osf-swash-ly1.tfm) \
tex(Baskervaldx-Ita-osf-swash-ly1.vf) \
tex(Baskervaldx-Ita-osf-swash-t1--base.tfm) \
tex(Baskervaldx-Ita-osf-swash-t1.tfm) \
tex(Baskervaldx-Ita-osf-swash-t1.vf) \
tex(Baskervaldx-Ita-osf-t1--base.tfm) \
tex(Baskervaldx-Ita-osf-t1.tfm) \
tex(Baskervaldx-Ita-osf-t1.vf) \
tex(Baskervaldx-Ita-osf-ts1--base.tfm) \
tex(Baskervaldx-Ita-osf-ts1.tfm) \
tex(Baskervaldx-Ita-osf-ts1.vf) \
tex(Baskervaldx-Ita-sup-ly1--base.tfm) \
tex(Baskervaldx-Ita-sup-ly1.tfm) \
tex(Baskervaldx-Ita-sup-ly1.vf) \
tex(Baskervaldx-Ita-sup-ot1.tfm) \
tex(Baskervaldx-Ita-sup-t1--base.tfm) \
tex(Baskervaldx-Ita-sup-t1.tfm) \
tex(Baskervaldx-Ita-sup-t1.vf) \
tex(Baskervaldx-Ita-tlf-ly1--base.tfm) \
tex(Baskervaldx-Ita-tlf-ly1.tfm) \
tex(Baskervaldx-Ita-tlf-ly1.vf) \
tex(Baskervaldx-Ita-tlf-ot1.tfm) \
tex(Baskervaldx-Ita-tlf-sc-ly1--base.tfm) \
tex(Baskervaldx-Ita-tlf-sc-ly1.tfm) \
tex(Baskervaldx-Ita-tlf-sc-ly1.vf) \
tex(Baskervaldx-Ita-tlf-sc-ot1--base.tfm) \
tex(Baskervaldx-Ita-tlf-sc-ot1.tfm) \
tex(Baskervaldx-Ita-tlf-sc-ot1.vf) \
tex(Baskervaldx-Ita-tlf-sc-t1--base.tfm) \
tex(Baskervaldx-Ita-tlf-sc-t1.tfm) \
tex(Baskervaldx-Ita-tlf-sc-t1.vf) \
tex(Baskervaldx-Ita-tlf-swash-ly1--base.tfm) \
tex(Baskervaldx-Ita-tlf-swash-ly1.tfm) \
tex(Baskervaldx-Ita-tlf-swash-ly1.vf) \
tex(Baskervaldx-Ita-tlf-swash-t1--base.tfm) \
tex(Baskervaldx-Ita-tlf-swash-t1.tfm) \
tex(Baskervaldx-Ita-tlf-swash-t1.vf) \
tex(Baskervaldx-Ita-tlf-t1--base.tfm) \
tex(Baskervaldx-Ita-tlf-t1.tfm) \
tex(Baskervaldx-Ita-tlf-t1.vf) \
tex(Baskervaldx-Ita-tlf-ts1--base.tfm) \
tex(Baskervaldx-Ita-tlf-ts1.tfm) \
tex(Baskervaldx-Ita-tlf-ts1.vf) \
tex(Baskervaldx-Ita-tosf-ly1--base.tfm) \
tex(Baskervaldx-Ita-tosf-ly1.tfm) \
tex(Baskervaldx-Ita-tosf-ly1.vf) \
tex(Baskervaldx-Ita-tosf-ot1.tfm) \
tex(Baskervaldx-Ita-tosf-sc-ly1--base.tfm) \
tex(Baskervaldx-Ita-tosf-sc-ly1.tfm) \
tex(Baskervaldx-Ita-tosf-sc-ly1.vf) \
tex(Baskervaldx-Ita-tosf-sc-ot1--base.tfm) \
tex(Baskervaldx-Ita-tosf-sc-ot1.tfm) \
tex(Baskervaldx-Ita-tosf-sc-ot1.vf) \
tex(Baskervaldx-Ita-tosf-sc-t1--base.tfm) \
tex(Baskervaldx-Ita-tosf-sc-t1.tfm) \
tex(Baskervaldx-Ita-tosf-sc-t1.vf) \
tex(Baskervaldx-Ita-tosf-swash-ly1--base.tfm) \
tex(Baskervaldx-Ita-tosf-swash-ly1.tfm) \
tex(Baskervaldx-Ita-tosf-swash-ly1.vf) \
tex(Baskervaldx-Ita-tosf-swash-t1--base.tfm) \
tex(Baskervaldx-Ita-tosf-swash-t1.tfm) \
tex(Baskervaldx-Ita-tosf-swash-t1.vf) \
tex(Baskervaldx-Ita-tosf-t1--base.tfm) \
tex(Baskervaldx-Ita-tosf-t1.tfm) \
tex(Baskervaldx-Ita-tosf-t1.vf) \
tex(Baskervaldx-Ita-tosf-ts1--base.tfm) \
tex(Baskervaldx-Ita-tosf-ts1.tfm) \
tex(Baskervaldx-Ita-tosf-ts1.vf) \
tex(Baskervaldx-Reg-lf-ly1--base.tfm) \
tex(Baskervaldx-Reg-lf-ly1.tfm) \
tex(Baskervaldx-Reg-lf-ly1.vf) \
tex(Baskervaldx-Reg-lf-ot1.tfm) \
tex(Baskervaldx-Reg-lf-sc-ly1--base.tfm) \
tex(Baskervaldx-Reg-lf-sc-ly1.tfm) \
tex(Baskervaldx-Reg-lf-sc-ly1.vf) \
tex(Baskervaldx-Reg-lf-sc-ot1--base.tfm) \
tex(Baskervaldx-Reg-lf-sc-ot1.tfm) \
tex(Baskervaldx-Reg-lf-sc-ot1.vf) \
tex(Baskervaldx-Reg-lf-sc-t1--base.tfm) \
tex(Baskervaldx-Reg-lf-sc-t1.tfm) \
tex(Baskervaldx-Reg-lf-sc-t1.vf) \
tex(Baskervaldx-Reg-lf-swash-ly1--base.tfm) \
tex(Baskervaldx-Reg-lf-swash-ly1.tfm) \
tex(Baskervaldx-Reg-lf-swash-ly1.vf) \
tex(Baskervaldx-Reg-lf-swash-t1--base.tfm) \
tex(Baskervaldx-Reg-lf-swash-t1.tfm) \
tex(Baskervaldx-Reg-lf-swash-t1.vf) \
tex(Baskervaldx-Reg-lf-t1--base.tfm) \
tex(Baskervaldx-Reg-lf-t1.tfm) \
tex(Baskervaldx-Reg-lf-t1.vf) \
tex(Baskervaldx-Reg-lf-ts1--base.tfm) \
tex(Baskervaldx-Reg-lf-ts1.tfm) \
tex(Baskervaldx-Reg-lf-ts1.vf) \
tex(Baskervaldx-Reg-osf-ly1--base.tfm) \
tex(Baskervaldx-Reg-osf-ly1.tfm) \
tex(Baskervaldx-Reg-osf-ly1.vf) \
tex(Baskervaldx-Reg-osf-ot1.tfm) \
tex(Baskervaldx-Reg-osf-sc-ly1--base.tfm) \
tex(Baskervaldx-Reg-osf-sc-ly1.tfm) \
tex(Baskervaldx-Reg-osf-sc-ly1.vf) \
tex(Baskervaldx-Reg-osf-sc-ot1--base.tfm) \
tex(Baskervaldx-Reg-osf-sc-ot1.tfm) \
tex(Baskervaldx-Reg-osf-sc-ot1.vf) \
tex(Baskervaldx-Reg-osf-sc-t1--base.tfm) \
tex(Baskervaldx-Reg-osf-sc-t1.tfm) \
tex(Baskervaldx-Reg-osf-sc-t1.vf) \
tex(Baskervaldx-Reg-osf-swash-ly1--base.tfm) \
tex(Baskervaldx-Reg-osf-swash-ly1.tfm) \
tex(Baskervaldx-Reg-osf-swash-ly1.vf) \
tex(Baskervaldx-Reg-osf-swash-t1--base.tfm) \
tex(Baskervaldx-Reg-osf-swash-t1.tfm) \
tex(Baskervaldx-Reg-osf-swash-t1.vf) \
tex(Baskervaldx-Reg-osf-t1--base.tfm) \
tex(Baskervaldx-Reg-osf-t1.tfm) \
tex(Baskervaldx-Reg-osf-t1.vf) \
tex(Baskervaldx-Reg-osf-ts1--base.tfm) \
tex(Baskervaldx-Reg-osf-ts1.tfm) \
tex(Baskervaldx-Reg-osf-ts1.vf) \
tex(Baskervaldx-Reg-sup-ly1--base.tfm) \
tex(Baskervaldx-Reg-sup-ly1.tfm) \
tex(Baskervaldx-Reg-sup-ly1.vf) \
tex(Baskervaldx-Reg-sup-ot1.tfm) \
tex(Baskervaldx-Reg-sup-t1--base.tfm) \
tex(Baskervaldx-Reg-sup-t1.tfm) \
tex(Baskervaldx-Reg-sup-t1.vf) \
tex(Baskervaldx-Reg-tlf-ly1--base.tfm) \
tex(Baskervaldx-Reg-tlf-ly1.tfm) \
tex(Baskervaldx-Reg-tlf-ly1.vf) \
tex(Baskervaldx-Reg-tlf-ot1.tfm) \
tex(Baskervaldx-Reg-tlf-sc-ly1--base.tfm) \
tex(Baskervaldx-Reg-tlf-sc-ly1.tfm) \
tex(Baskervaldx-Reg-tlf-sc-ly1.vf) \
tex(Baskervaldx-Reg-tlf-sc-ot1--base.tfm) \
tex(Baskervaldx-Reg-tlf-sc-ot1.tfm) \
tex(Baskervaldx-Reg-tlf-sc-ot1.vf) \
tex(Baskervaldx-Reg-tlf-sc-t1--base.tfm) \
tex(Baskervaldx-Reg-tlf-sc-t1.tfm) \
tex(Baskervaldx-Reg-tlf-sc-t1.vf) \
tex(Baskervaldx-Reg-tlf-swash-ly1--base.tfm) \
tex(Baskervaldx-Reg-tlf-swash-ly1.tfm) \
tex(Baskervaldx-Reg-tlf-swash-ly1.vf) \
tex(Baskervaldx-Reg-tlf-swash-t1--base.tfm) \
tex(Baskervaldx-Reg-tlf-swash-t1.tfm) \
tex(Baskervaldx-Reg-tlf-swash-t1.vf) \
tex(Baskervaldx-Reg-tlf-t1--base.tfm) \
tex(Baskervaldx-Reg-tlf-t1.tfm) \
tex(Baskervaldx-Reg-tlf-t1.vf) \
tex(Baskervaldx-Reg-tlf-ts1--base.tfm) \
tex(Baskervaldx-Reg-tlf-ts1.tfm) \
tex(Baskervaldx-Reg-tlf-ts1.vf) \
tex(Baskervaldx-Reg-tosf-ly1--base.tfm) \
tex(Baskervaldx-Reg-tosf-ly1.tfm) \
tex(Baskervaldx-Reg-tosf-ly1.vf) \
tex(Baskervaldx-Reg-tosf-ot1.tfm) \
tex(Baskervaldx-Reg-tosf-sc-ly1--base.tfm) \
tex(Baskervaldx-Reg-tosf-sc-ly1.tfm) \
tex(Baskervaldx-Reg-tosf-sc-ly1.vf) \
tex(Baskervaldx-Reg-tosf-sc-ot1--base.tfm) \
tex(Baskervaldx-Reg-tosf-sc-ot1.tfm) \
tex(Baskervaldx-Reg-tosf-sc-ot1.vf) \
tex(Baskervaldx-Reg-tosf-sc-t1--base.tfm) \
tex(Baskervaldx-Reg-tosf-sc-t1.tfm) \
tex(Baskervaldx-Reg-tosf-sc-t1.vf) \
tex(Baskervaldx-Reg-tosf-swash-ly1--base.tfm) \
tex(Baskervaldx-Reg-tosf-swash-ly1.tfm) \
tex(Baskervaldx-Reg-tosf-swash-ly1.vf) \
tex(Baskervaldx-Reg-tosf-swash-t1--base.tfm) \
tex(Baskervaldx-Reg-tosf-swash-t1.tfm) \
tex(Baskervaldx-Reg-tosf-swash-t1.vf) \
tex(Baskervaldx-Reg-tosf-t1--base.tfm) \
tex(Baskervaldx-Reg-tosf-t1.tfm) \
tex(Baskervaldx-Reg-tosf-t1.vf) \
tex(Baskervaldx-Reg-tosf-ts1--base.tfm) \
tex(Baskervaldx-Reg-tosf-ts1.tfm) \
tex(Baskervaldx-Reg-tosf-ts1.vf) \
tex(Baskervaldx-osf.tfm) \
tex(Baskervaldx.map) \
tex(Baskervaldx.sty) \
tex(LY1Baskervaldx-LF.fd) \
tex(LY1Baskervaldx-OsF.fd) \
tex(LY1Baskervaldx-Sup.fd) \
tex(LY1Baskervaldx-TLF.fd) \
tex(LY1Baskervaldx-TOsF.fd) \
tex(OT1Baskervaldx-LF.fd) \
tex(OT1Baskervaldx-OsF.fd) \
tex(OT1Baskervaldx-Sup.fd) \
tex(OT1Baskervaldx-TLF.fd) \
tex(OT1Baskervaldx-TOsF.fd) \
tex(T1Baskervaldx-LF.fd) \
tex(T1Baskervaldx-OsF.fd) \
tex(T1Baskervaldx-Sup.fd) \
tex(T1Baskervaldx-TLF.fd) \
tex(T1Baskervaldx-TOsF.fd) \
tex(TS1Baskervaldx-LF.fd) \
tex(TS1Baskervaldx-OsF.fd) \
tex(TS1Baskervaldx-TLF.fd) \
tex(TS1Baskervaldx-TOsF.fd) \
tex(bvalph.enc) \
tex(bvtabosf.enc) \
tex(zbv_23jm4j.enc) \
tex(zbv_2445cl.enc) \
tex(zbv_2kku7k.enc) \
tex(zbv_2n2qka.enc) \
tex(zbv_2xv27p.enc) \
tex(zbv_2zeho7.enc) \
tex(zbv_34qyyt.enc) \
tex(zbv_4f5bev.enc) \
tex(zbv_524fcc.enc) \
tex(zbv_556rta.enc) \
tex(zbv_5p6atn.enc) \
tex(zbv_5zt4ml.enc) \
tex(zbv_6dnovg.enc) \
tex(zbv_6lr3v3.enc) \
tex(zbv_6rdtju.enc) \
tex(zbv_6xreh4.enc) \
tex(zbv_7d54ky.enc) \
tex(zbv_7i75ol.enc) \
tex(zbv_7nnme4.enc) \
tex(zbv_ahc6ab.enc) \
tex(zbv_ak7beg.enc) \
tex(zbv_aorlch.enc) \
tex(zbv_auq4k5.enc) \
tex(zbv_awcfcx.enc) \
tex(zbv_ax2yo2.enc) \
tex(zbv_ax7osu.enc) \
tex(zbv_c3asvt.enc) \
tex(zbv_ck4t6h.enc) \
tex(zbv_cl2iyt.enc) \
tex(zbv_clcsgf.enc) \
tex(zbv_coqtyh.enc) \
tex(zbv_cv7nez.enc) \
tex(zbv_d7elqy.enc) \
tex(zbv_d7lahw.enc) \
tex(zbv_dbb2hd.enc) \
tex(zbv_dw7i6y.enc) \
tex(zbv_edkp5z.enc) \
tex(zbv_ezfzzx.enc) \
tex(zbv_feassy.enc) \
tex(zbv_g4f2qe.enc) \
tex(zbv_g5xsbp.enc) \
tex(zbv_gar3zb.enc) \
tex(zbv_gjwmpg.enc) \
tex(zbv_h4nqsn.enc) \
tex(zbv_ik76ei.enc) \
tex(zbv_ilkd46.enc) \
tex(zbv_itooof.enc) \
tex(zbv_jwmruw.enc) \
tex(zbv_k3ascw.enc) \
tex(zbv_k6hbcl.enc) \
tex(zbv_kq7kv3.enc) \
tex(zbv_l44ess.enc) \
tex(zbv_lewyuf.enc) \
tex(zbv_lozoyg.enc) \
tex(zbv_lxdjmd.enc) \
tex(zbv_m4qttc.enc) \
tex(zbv_m5lkgj.enc) \
tex(zbv_mu6kzn.enc) \
tex(zbv_mvsyl4.enc) \
tex(zbv_mys6kl.enc) \
tex(zbv_nt5h45.enc) \
tex(zbv_nwv7yn.enc) \
tex(zbv_ofzzxu.enc) \
tex(zbv_pqcihf.enc) \
tex(zbv_puztjr.enc) \
tex(zbv_riybhr.enc) \
tex(zbv_rosua2.enc) \
tex(zbv_scthrl.enc) \
tex(zbv_sv3nex.enc) \
tex(zbv_teykvl.enc) \
tex(zbv_tfcpq3.enc) \
tex(zbv_tnmdy3.enc) \
tex(zbv_tv7w6k.enc) \
tex(zbv_uguye6.enc) \
tex(zbv_untte3.enc) \
tex(zbv_upot5e.enc) \
tex(zbv_uy4eps.enc) \
tex(zbv_v577lu.enc) \
tex(zbv_wg6wcc.enc) \
tex(zbv_wvrs5w.enc) \
tex(zbv_xbckbj.enc) \
tex(zbv_xebzk2.enc) \
tex(zbv_xjuza2.enc) \
tex(zbv_xotpaa.enc) \
tex(zbv_y62qbt.enc) \
tex(zbv_y77okd.enc) \
tex(zbv_yk4dqp.enc) \
tex(zbv_ymibyh.enc) \
tex(zbv_zag37q.enc) \
tex(zbv_zb3hlf.enc) \
tex(zbv_zey2cz.enc) \
tex(zbv_zkqdv4.enc) \
tex(zbvbmi.tfm) \
tex(zbvbmi.vf) \
tex(zbvmi.tfm) \
tex(zbvmi.vf) \
texlive-baskervaldx"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(fontaxes.sty) \
tex(fontenc.sty) \
tex(mweights.sty) \
tex(ntxbmi.tfm) \
tex(ntxmi.tfm) \
tex(scalefnt.sty) \
tex(textcomp.sty) \
tex(updmap.cfg) \
tex(xkeyval.sty) \
texlive \
texlive-baskervaldx-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
