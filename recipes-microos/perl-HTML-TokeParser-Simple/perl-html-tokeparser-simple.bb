SUMMARY = "Easy to use C<HTML::TokeParser> interface"
DESCRIPTION = "'HTML::TokeParser' is an excellent module that's often used for parsing \
HTML. However, the tokens returned are not exactly intuitive to parse: \
 \
 ['S',  $tag, $attr, $attrseq, $text] \
 ['E',  $tag, $text] \
 ['T',  $text, $is_data] \
 ['C',  $text] \
 ['D',  $text] \
 ['PI', $token0, $text] \
 \
To simplify this, 'HTML::TokeParser::Simple' allows the user ask more \
intuitive (read: more self-documenting) questions about the tokens \
returned. \
 \
You can also rebuild some tags on the fly. Frequently, the attributes \
associated with start tags need to be altered, added to, or deleted. This \
functionality is built in. \
 \
Since this is a subclass of 'HTML::TokeParser', all 'HTML::TokeParser' \
methods are available. To truly appreciate the power of this module, please \
read the documentation for 'HTML::TokeParser' and 'HTML::Parser'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "3.16"

RPM_NAME = "perl-HTML-TokeParser-Simple-3.16-5.24.noarch.rpm"
RPM_HASH = "d3496a97e74a8cd79c7d02e7eea69358efdd0a29c78e1bb72d1e4211b8858c14544caeac7a76cecab950e816f7e2edee506b3f9aa0e2f3e18c408d47257a54d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(HTML::TokeParser::Simple) perl(HTML::TokeParser::Simple::Token) perl(HTML::TokeParser::Simple::Token::Comment) perl(HTML::TokeParser::Simple::Token::Declaration) perl(HTML::TokeParser::Simple::Token::ProcessInstruction) perl(HTML::TokeParser::Simple::Token::Tag) perl(HTML::TokeParser::Simple::Token::Tag::End) perl(HTML::TokeParser::Simple::Token::Tag::Start) perl(HTML::TokeParser::Simple::Token::Text) perl-HTML-TokeParser-Simple"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(HTML::Parser) perl(HTML::TokeParser) perl(Sub::Override)"

inherit rpm
