package it.skrape.selects.html5

import it.skrape.selects.CssSelector
import it.skrape.selects.Doc

/**
 * Will define a <content>-tags css query selector.
 * By default it will just be the specific tag-name.
 * It is possible to define a more concrete selector by using the provided fields of the CssSelector object or
 * by passing a raw css query selector as parameter.
 * If a selector is passed as parameter as well as be defined via CssSelector fields, they will be merged.
 * @see CssSelector
 * @param cssSelector
 * @return T
 */
fun <T> Doc.content(cssSelector: String = "", init: CssSelector.() -> T) =
        selection("content$cssSelector", init)

/**
 * Will define a <shadow>-tags css query selector.
 * By default it will just be the specific tag-name.
 * It is possible to define a more concrete selector by using the provided fields of the CssSelector object or
 * by passing a raw css query selector as parameter.
 * If a selector is passed as parameter as well as be defined via CssSelector fields, they will be merged.
 * @see CssSelector
 * @param cssSelector
 * @return T
 */
fun <T> Doc.shadow(cssSelector: String = "", init: CssSelector.() -> T) =
        selection("shadow$cssSelector", init)

/**
 * Will define a <slot>-tags css query selector.
 * By default it will just be the specific tag-name.
 * It is possible to define a more concrete selector by using the provided fields of the CssSelector object or
 * by passing a raw css query selector as parameter.
 * If a selector is passed as parameter as well as be defined via CssSelector fields, they will be merged.
 * @see CssSelector
 * @param cssSelector
 * @return T
 */
fun <T> Doc.slot(cssSelector: String = "", init: CssSelector.() -> T) =
        selection("slot$cssSelector", init)

/**
 * Will define a <template>-tags css query selector.
 * By default it will just be the specific tag-name.
 * It is possible to define a more concrete selector by using the provided fields of the CssSelector object or
 * by passing a raw css query selector as parameter.
 * If a selector is passed as parameter as well as be defined via CssSelector fields, they will be merged.
 * @see CssSelector
 * @param cssSelector
 * @return T
 */
fun <T> Doc.template(cssSelector: String = "", init: CssSelector.() -> T) =
        selection("template$cssSelector", init)
