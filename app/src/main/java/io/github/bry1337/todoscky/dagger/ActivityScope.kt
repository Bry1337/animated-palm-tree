package io.github.bry1337.todoscky.dagger

import javax.inject.Scope

/**
 * Created by bry1337 on 07/05/2018.
 *
 * @author edwardbryan.abergas@gmail.com
 */

/**
 * In Dagger, an unscoped component cannot depend on a scoped component. As [ApplicationComponent]
 * a scoped component @code @Singleton, we create a custom scope to be used by all fragment components.
 * Additionally, a component with a specific scope cannot have a subcomponent with the same scope.
 */
@Scope
@kotlin.annotation.Retention
annotation class ActivityScope {
}