SUMMARY = "Readable Text Serif Font for Screen"
DESCRIPTION = "Merriweather was designed to be a text face that is pleasant to read on screens. \
 \
Merriweather is an evolving and will be updated. \
As of now there are 4 styles: Regular, Light, Bold, and Black. There will also \
be Italic in each of these weights. \
And fairly soon after that there will also be a sans serif version which mirrors \
the weights and styles of the Serif design. \
 \
Designed by Eben Sorkin, Merriweather features a very large x height, slightly \
condensed letterforms, a mild diagonal stress, sturdy serifs and open forms. \
 \
Because Merriweather is a work in progress and will be improved regularly. \
This means you can request improvements \
and even fund specific features if if they are outside of the current scope of work. \
For more information and to stay updated see Eben Sorkin's blog and Flickr stream and \
the Merriweather Twitter microblog. \
 \
Designer: Eben Sorkin"
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-merriweather-fonts-2.001-1.11.noarch.rpm"
RPM_HASH = "f60670560773723b860981034bdb2886bb3274786b427dfe008435b25b9d527a7088e46f5b91df93737b65e404398bc55b1e5a89a39b380441430909886d87b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-merriweather-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
